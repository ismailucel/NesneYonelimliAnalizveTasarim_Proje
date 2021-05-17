  
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

public class AkilliCihazKullanici {

	Gonderici gonderici=new Gonderici();
    String kullaniciAdi,sifre;
    
    
    EkranaYaz ekran=new EkranaYaz();

    private AkilliCihazKullanici(AkilliCihazKullaniciBuilder builder) {
        this.kullaniciAdi= builder.kullaniciAdi;
        this.sifre= builder.sifre;
    }


    public void setKullaniciAdi(String kullaniciAdi) { this.kullaniciAdi = kullaniciAdi; }

    public void setSifre(String sifre) {
        this.sifre = sifre;
    }

    public String getKullaniciAdi() {
        return kullaniciAdi;
    }

    public String getSifre() {
        return sifre;
    }

    public void tekrarDene(){

        Scanner input =new Scanner(System.in);
        ekran.mesajGoruntule("Kullanıcı adı Giriniz:");
        this.kullaniciAdi=input.nextLine();
        ekran.mesajGoruntule("Şifre Giriniz:");
        this.sifre=input.nextLine();
        this.gonder();
    }

    public void gonder(){
        gonderici.EkranaGonder(this);
        gonderici.AkilliCihazaGonder(this);
    }

    public static class AkilliCihazKullaniciBuilder
    {
        private String kullaniciAdi;
        private String sifre;

        public AkilliCihazKullaniciBuilder(String kullaniciAdi, String sifre) {
            this.kullaniciAdi = kullaniciAdi;
            this.sifre = sifre;
        }
        public AkilliCihazKullaniciBuilder setKullaniciAdi(String kullaniciAdi) {
            this.kullaniciAdi = kullaniciAdi;
            return this;

        }

        public AkilliCihazKullaniciBuilder setSifre(String sifre) {
            this.sifre = sifre;
            return this;

        }
        public AkilliCihazKullanici build() {

            return new AkilliCihazKullanici(this);
        }

    }

}
