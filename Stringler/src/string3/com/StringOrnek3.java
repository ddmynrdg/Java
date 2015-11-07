package string3.com;

import java.util.StringTokenizer;

public class StringOrnek3 
{

	
	public static void main(String[] args) 
	{
		
		String dizge = "JAVA JSP Android*.NET\\ C++/Mobile";
		// 6 tokenimiz var
		StringTokenizer s = new StringTokenizer(dizge, " *\\/");
		StringTokenizer s1 = new StringTokenizer(dizge);
		
		
		System.out.println(s.countTokens());
		while(s.hasMoreTokens())
		{
			System.out.println(s.nextToken());
			System.out.println(s.nextToken());
		}
		
		while(s1.hasMoreElements())
		{
			System.out.println((String) s1.nextElement());
		}
	
		String ad = "sezer";
		String soyad = "tanrýverdi";
		
		//ad = ad + soyad;
		
		StringBuffer s3 = new StringBuffer(ad);
		s3.append(" ").append(soyad).append(" ").append("didem").append(" ").append("yanardag");
		
		System.out.println(s3);
		
		s3.replace(0, 5, "Dilmen");
		System.out.println(s3);
		
		s3.insert(6, " veri ekleme");
		System.out.println(s3);
		
		s3.delete(7, 18);
		System.out.println(s3);
		
		s3.reverse();
		System.out.println(s3);
		
	}
	

}
