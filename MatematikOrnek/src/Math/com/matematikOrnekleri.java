package Math.com;

import java.util.Random;

public class matematikOrnekleri 
{

	public static void main(String[] args) 
	{
		for (int i = 0; i <= 10; i++) {
			System.out.println((int)  Math.pow(2, i)); //�s alma
		}
		System.out.println("\n1024 karek�k� : "+ (int) Math.sqrt(1204)); // karek� alma
		System.out.println(" - 45 in mutlak de�erini alal�m : " + Math.abs(-45));
		System.out.println("3.55 �st de�ere yuvarla : " + Math.ceil(3.55));
		System.out.println("3.55 alt degerini bulal�m : " + Math.floor(3.55));
		
		System.out.println("35 ve 155 aras�ndaki b�y�k sayi : " + Math.max(35, 155));
		System.out.println("25 ve 244 aras�ndaki k���k sayi : " + Math.min(25, 244));
		
		System.out.println("rastgele sayi : " + Math.random()); // d�necek de�er 0 ile 1 aras�nda double de�er d�ner.
		System.out.println("rastgele ��kan say�y� 10 ile �arp�msonucu : " + (int) (Math.random() * 100));
		
		Random r = new Random();
		int a = r.nextInt(100);
		float f = r.nextFloat();
		
		System.out.println("Sonucumuz : " + a);
		System.out.println("randon s�n�f�nda rastgele float de�er: " + f);//0 ile 1 aras� bir float de�er verir.
		
		
		System.out.println("1.5 radyan : " + Math.toDegrees(1.5) + " derecedir");
		System.out.println("45 derece : " + Math.toRadians(45) + " radyand�r.");
		
		System.out.println("sin 90 = " + Math.sin(Math.toRadians(90)));
		System.out.println("cos 55 = " + Math.cos(Math.toRadians(55)));
		
		System.out.println("Argsin 0.47 = " + Math.toDegrees(Math.asin(0.47)));
		System.out.println("ArgCos 0.57 = " + Math.toDegrees(Math.acos(0.57)));
		
		System.out.println("ln e  = " + Math.log(Math.E));
		System.out.println("log10(5) = " + Math.log10(5));
		System.out.println("ln(7+1) = " + Math.log1p(7));
		
		
		
		
		
		
		
		
		
	}

}
