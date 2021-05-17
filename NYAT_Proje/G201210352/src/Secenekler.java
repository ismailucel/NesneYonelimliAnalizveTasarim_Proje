  
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


public class Secenekler implements ISecenekler {

	@Override
	public void secenekleriListele() {
		// TODO Auto-generated method stub
		   System.out.println("******************************************");
		   
		   System.out.println("Lütfen yapmak istediğiniz işlemi seçiniz.");
	       
	       System.out.println("1) Soğutucu Aç!");
	       System.out.println("2) Soğutucu Kapat!");
	       System.out.println("3) Sıcaklık Algıla!");
	       
	       System.out.println("******************************************");
	}

}
