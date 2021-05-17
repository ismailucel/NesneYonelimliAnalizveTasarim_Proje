  
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

import java.text.DecimalFormat;
import java.util.Random;


public class SicaklikAlgilayici implements ISicaklikAlgilayici {

	@Override
	public String sicaklikAlgila() {
		// TODO Auto-generated method stub
		Random rast=new Random();
        
        double sicaklik =rast.nextFloat()*55;
        
        DecimalFormat formatter = new DecimalFormat("##.##");
        
        return "Sıcaklık :"+ formatter.format(sicaklik);
	}

}
