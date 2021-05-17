  
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




import java.util.Scanner;

public class Baslangıc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EkranaYaz ekran=new EkranaYaz();
        ekran.mesajGoruntule("**********************************************************");
        ekran.mesajGoruntule("Hoşgeldiniz. Lütfen kullanıcı adınızı ve şifresini giriniz:");
        ekran.mesajGoruntule("**********************************************************");
        Scanner input =new Scanner(System.in);
        
        ekran.mesajGoruntule("Kullanıcı Adınızı Giriniz:");
        String kullaniciAdi=input.nextLine();
        ekran.mesajGoruntule("Şifrenizi Giriniz:");
        String sifre=input.nextLine();
        
        AkilliCihazKullanici kullanici=new AkilliCihazKullanici.AkilliCihazKullaniciBuilder(kullaniciAdi,sifre).build();
        
        kullanici.gonder();
        

        
	}

}
