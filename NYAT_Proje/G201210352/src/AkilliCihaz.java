  
/****************************************************************************
**					SAKARYA ÜNİVERSİTESİ
**				BİLGİSAYAR VE BİLİŞİM BİLİMLERİ FAKÜLTESİ
**				    BİLGİSAYAR MÜHENDİSLİĞİ BÖLÜMÜ
**				   NESNE YÖNELİMLİ ANALİZ VE TASARIM DERSİ
**					2020-2021 BAHAR DÖNEMİ
**	
**				 
**				ÖĞRENCİ ADI............: İsmail Üçel    
**				ÖĞRENCİ NUMARASI.......: G201210352
**              DERSİN ALINDIĞI GRUP...: 2.Öğretim B Grubu
****************************************************************************/

import java.sql.Statement;
import java.util.Scanner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class AkilliCihaz {
	
	ISecenekler secenekler=new Secenekler();
    
    IEyleyici eyleyici=new Eyleyici();
    
    ISicaklikAlgilayici sicaklikAlgilayici=new SicaklikAlgilayici();
    
    IEkran ekran=new EkranaYaz();
    

    public void kullaniciDogrula(AkilliCihazKullanici kullanici){
    	
        if(!veritabaniBaglantisi(kullanici.getKullaniciAdi(),kullanici.getSifre())){
        	ekran.mesajGoruntule("******************************************************");
            ekran.mesajGoruntule("Kullanıcı adı veya şifreniz yanlış. Tekrar deneyiniz:");
            ekran.mesajGoruntule("******************************************************");
            kullanici.tekrarDene();
        }else{
            islemSec();
        }
    }


    public boolean veritabaniBaglantisi(String kullaniciAdi, String sifre)
    {
        boolean baglantiDurumu=false;
        try
        {  
        
            Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/AkilliCihazVeritabani",
                    "postgres", "fb200019661957");
            if (conn != null)
                ekran.mesajGoruntule("Veritabanına başarıyla bağlanıldı!");
            else
                ekran.mesajGoruntule("Veritabanına bağlanılamadı!");

            String sql= "SELECT*  FROM \"KullaniciBilgileri\" WHERE \"KullaniciAdi\"='"+kullaniciAdi+"' AND  \"KullaniciSifresi\"='"+sifre+"'";

           
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            if(rs.next()) {
                ekran.mesajGoruntule("Bağlantı başarılı.");
                baglantiDurumu=true;
            }
            
            rs.close();
            stmt.close();
            
            conn.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return baglantiDurumu;
    }
    
    
    public void islemSec(){

        secenekler.secenekleriListele();
        Scanner reader = new Scanner(System.in);
        int islemNumarasi = reader.nextInt();
        switch (islemNumarasi){
            case 1:ekran.mesajGoruntule( eyleyici.SogutucuAc());
                islemeDevamDurumu();
                break;
            case 2:ekran.mesajGoruntule( eyleyici.SogutucuKapat());
                islemeDevamDurumu();
                break;
            case 3:ekran.mesajGoruntule( sicaklikAlgilayici.sicaklikAlgila());
                islemeDevamDurumu();
                break;
            default: ekran.mesajGoruntule("Yanlış bir seçim yaptınız. Geçerli bir değer giriniz:");
                islemSec();
        }
    }
    public void islemeDevamDurumu(){
        ekran.mesajGoruntule("Cihazı kullanmaya devam etmek istiyor musunuz? (Evet/Hayır)");
        Scanner input =new Scanner(System.in);

        String devamDurumu=input.nextLine();
        if(devamDurumu.matches("Evet")){
            islemSec();
        }else if(devamDurumu.matches("Hayır")){
            ekran.mesajGoruntule("Cihaz kapatılmıştır!");
        }else{
            ekran.mesajGoruntule("Hatalı bir giriş yaptınız!");
            islemeDevamDurumu();
        }
    }

}
