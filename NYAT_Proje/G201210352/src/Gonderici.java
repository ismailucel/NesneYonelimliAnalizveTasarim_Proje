  
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

public class Gonderici {
	AkilliCihaz akilliCihaz=new AkilliCihaz();
    EkranaYaz ekran=new EkranaYaz();
    public void EkranaGonder(AkilliCihazKullanici kullanici){
        ekran.mesajGoruntule("Kullanıcı adınız: "+kullanici.getKullaniciAdi()+" Şifreniz: "+kullanici.getSifre());
    }

  public void AkilliCihazaGonder(AkilliCihazKullanici kullanici){

        akilliCihaz.kullaniciDogrula(kullanici);
    }
}
