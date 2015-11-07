package externalizable.com;

import java.io.*;

public class musteri2 implements Externalizable
{
	private String ad;
	private String soyad;
	private int yas;
	
	public musteri2(String ad, String soyad, int yas) 
	{
		this.ad = ad;
		this.soyad = soyad;
		this.yas = yas;
	}

	public String getAd() {
		return ad;
	}
	public String getSoyad() {
		return soyad;
	}
	public int getYas() {
		return yas;
	}

	public void writeExternal(ObjectOutput o1)
	{
		try {
			o1.writeObject(this.ad);
			o1.writeObject(this.soyad); 
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void readExternal(ObjectInput o2) 
	{
			try {
				this.ad = (String) o2.readObject();
				this.soyad = (String) o2.readObject();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		
	}



}
