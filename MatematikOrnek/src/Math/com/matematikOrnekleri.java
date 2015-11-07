package Math.com;

import java.util.Random;

public class matematikOrnekleri 
{

	public static void main(String[] args) 
	{
		for (int i = 0; i <= 10; i++) {
			System.out.println((int)  Math.pow(2, i)); //üs alma
		}
		System.out.println("\n1024 karekökü : "+ (int) Math.sqrt(1204)); // karekö alma
		System.out.println(" - 45 in mutlak deðerini alalým : " + Math.abs(-45));
		System.out.println("3.55 üst deðere yuvarla : " + Math.ceil(3.55));
		System.out.println("3.55 alt degerini bulalým : " + Math.floor(3.55));
		
		System.out.println("35 ve 155 arasýndaki büyük sayi : " + Math.max(35, 155));
		System.out.println("25 ve 244 arasýndaki küþük sayi : " + Math.min(25, 244));
		
		System.out.println("rastgele sayi : " + Math.random()); // dönecek deðer 0 ile 1 arasýnda double deðer döner.
		System.out.println("rastgele çýkan sayýyý 10 ile çarpýmsonucu : " + (int) (Math.random() * 100));
		
		Random r = new Random();
		int a = r.nextInt(100);
		float f = r.nextFloat();
		
		System.out.println("Sonucumuz : " + a);
		System.out.println("randon sýnýfýnda rastgele float deðer: " + f);//0 ile 1 arasý bir float deðer verir.
		
		
		System.out.println("1.5 radyan : " + Math.toDegrees(1.5) + " derecedir");
		System.out.println("45 derece : " + Math.toRadians(45) + " radyandýr.");
		
		System.out.println("sin 90 = " + Math.sin(Math.toRadians(90)));
		System.out.println("cos 55 = " + Math.cos(Math.toRadians(55)));
		
		System.out.println("Argsin 0.47 = " + Math.toDegrees(Math.asin(0.47)));
		System.out.println("ArgCos 0.57 = " + Math.toDegrees(Math.acos(0.57)));
		
		System.out.println("ln e  = " + Math.log(Math.E));
		System.out.println("log10(5) = " + Math.log10(5));
		System.out.println("ln(7+1) = " + Math.log1p(7));
		
		
		
		
		
		
		
		
		
	}

}
