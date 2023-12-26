package study121901;

import java.util.Arrays;
import java.util.Scanner;

public class String_method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String word="i like banana chacha";

//		1. ¹®ÀÚ¿­¿¡¼­ Æ¯Á¤ ¹®ÀÚ ÃßÃâ
		char ch = word.charAt(2);
		System.out.println( ch );
		
		Scanner scan = new Scanner(System.in);
		ch = scan.next().charAt(0);
		System.out.println( ch );
		
//		2. ¹®ÀÚ¿­ ºñ±³ - equals()
		if ( word.equals("i like") )
			System.out.println( "°°´Ù" );
		else
			System.out.println( "°°Áö¾Ê´Ù" );
		
//		3. ¹®ÀÚ¿­À» byte·Î º¯È¯ - getBytes()
		byte[] code = word.getBytes();
		System.out.println( Arrays.toString( code ) );
		
//		4. ¹®ÀÚ¿­¿¡¼­ Æ¯Á¤ ¹®ÀÚ¿­ÀÇ À§Ä¡¸¦ ¸®ÅÏ - indexOf()
		int k = word.indexOf('k');
		System.out.println( k );
		int banana = word.indexOf("banana");
		System.out.println( banana );
		
		int a5 = word.indexOf('a', 10);
		System.out.println( a5 );
		int cha = word.indexOf("ch", 15);
		System.out.println( cha );
		
//		5. ¹®ÀÚ¿­ÀÇ ±æÀÌ - length()
		int len = word.length();
		System.out.println("¹®ÀÚ¿­ ±æÀÌ : " + len);
		
//		6. ¹®ÀÚ¿­ º¯°æ(Ä¡È¯) - replace()
		String temp = word.replace("banana chacha", "rescue tayo");
		System.out.println("¿øº» : " + word);
		System.out.println("º¯°æÈÄ : " + temp);
		
//		ÀÚ¹Ù½ºÅ©¸³Æ®¿¡¼­ Á¤±ÔÇ¥Çö½ÄÀ» ÀÌ¿ëÇÏ¿© ¹®ÀÚ¿­ º¯°æ
//		ÀÚ¹Ù¿¡¼­µµ Á¤±ÔÇ¥Çö½ÄÀ» »ç¿ëÇÑ´Ù.
//		[^0-9] 
//		Æ¯¼ö¹®ÀÚ Á¦°Å [^¤¡-¤¾¤¿-¤Ó°¡-ÆRa-zA-Z0-9]	
		
		temp = word.replaceAll( "a" , "c" );
		//a.À» ÇÏ¸é a µÚ¿¡ÀÖ´Â°É c·Î ¹Ù²Ù¾î¶ó
		System.out.println( temp );
	
		temp = "010-1234-5678";
		temp = temp.replaceAll("[^0-9]" , "");
		System.out.println(temp);
		
		
		
	}
}
