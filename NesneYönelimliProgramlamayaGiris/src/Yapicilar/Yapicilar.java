package Yapicilar;

public class Yapicilar
{

	String ad;
	String soyad;
	
  public Yapicilar() {
		// TODO Auto-generated constructor stub
	  System.out.println("varsay�lan yap�c�lar �a�r�ld�");
	}
  public Yapicilar(String a, String b)
  {
	  ad = a;
	  soyad = b;
  }
  public Yapicilar(int a, int b)
  {
	  carp(a,b);
  }
  void yazdir()
  {
	  System.out.println("ad : " +ad+ " soyad�: " + soyad);
  }
	
  void carp(int x, int y)
  {
	  System.out.println("�arp�m sonucu: " + x*y);
  }
	public static void main(String[] args) 
	{
		Yapicilar nesne = new Yapicilar();
		Yapicilar nesne2 =new Yapicilar("didem", "kjfp");
		nesne2.yazdir();
		Yapicilar nesne3 = new Yapicilar(4,6);
	}

}
