  
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

public class Eyleyici implements IEyleyici {

	@Override
	public String SogutucuAc() {
		// TODO Auto-generated method stub
		return "Soğutucu Açma Talebi Gönderildi.\n"
		+ "Eyleyiciye Gönderildi.\n"
		+ "Soğutucu Açıldı.";
	}

	@Override
	public String SogutucuKapat() {
		// TODO Auto-generated method stub
		 return "Soğutucu Kapatma Talebi Gönderildi.\n"
  		+ "Eyleyiciye Gönderildi.\n"
  		+ "Soğutucu Kapatıldı.";
	}

}
