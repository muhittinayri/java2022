package intro;

import java.util.Iterator;

public class Main {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		
		// Değişken isimlendirmeleri Java'da camelCase yazılır.
		String ortaMetin = "İlginizi Çekebilir";
		String altMetin = "Vade Süresi";
		
		System.out.println(ortaMetin);
		
		//Tam Sayı - integer
		int vade = 12;
		double dolarDun = 18.20;
		double dolarBugun = 18.20;
		
		boolean dolarDustuMu = false;
		
		String okYonu = "";
		
		if (dolarBugun < dolarDun) {
			okYonu = "down.svg";
			System.out.println(okYonu);
		}else if(dolarBugun > dolarDun){
			okYonu = "up.svg";
			System.out.println(okYonu);
		}
		else {
			okYonu = "equal.svg";
			System.out.println(okYonu);
		}
		
		//Array
		String[] krediler = {"Hızlı Kredi", "Maaşını Halkbanktan alanlar", "Mutlu Emekli"};
		System.out.println(krediler[0]);
		System.out.println(krediler[1]);
		System.out.println(krediler[2]);
		
		for (int i = 0; i < krediler.length; i++) {
			System.out.println(krediler[i]);
		}
	}
}
