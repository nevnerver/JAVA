package study121901;

import java.util.Arrays;
import java.util.Scanner;

public class String_method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String word="i like banana chacha";

//		1. ���ڿ����� Ư�� ���� ����
		char ch = word.charAt(2);
		System.out.println( ch );
		
		Scanner scan = new Scanner(System.in);
		ch = scan.next().charAt(0);
		System.out.println( ch );
		
//		2. ���ڿ� �� - equals()
		if ( word.equals("i like") )
			System.out.println( "����" );
		else
			System.out.println( "�����ʴ�" );
		
//		3. ���ڿ��� byte�� ��ȯ - getBytes()
		byte[] code = word.getBytes();
		System.out.println( Arrays.toString( code ) );
		
//		4. ���ڿ����� Ư�� ���ڿ��� ��ġ�� ���� - indexOf()
		int k = word.indexOf('k');
		System.out.println( k );
		int banana = word.indexOf("banana");
		System.out.println( banana );
		
		int a5 = word.indexOf('a', 10);
		System.out.println( a5 );
		int cha = word.indexOf("ch", 15);
		System.out.println( cha );
		
//		5. ���ڿ��� ���� - length()
		int len = word.length();
		System.out.println("���ڿ� ���� : " + len);
		
//		6. ���ڿ� ����(ġȯ) - replace()
		String temp = word.replace("banana chacha", "rescue tayo");
		System.out.println("���� : " + word);
		System.out.println("������ : " + temp);
		
//		�ڹٽ�ũ��Ʈ���� ����ǥ������ �̿��Ͽ� ���ڿ� ����
//		�ڹٿ����� ����ǥ������ ����Ѵ�.
//		[^0-9] 
//		Ư������ ���� [^��-����-�Ӱ�-�Ra-zA-Z0-9]	
		
		temp = word.replaceAll( "a" , "c" );
		//a.�� �ϸ� a �ڿ��ִ°� c�� �ٲپ��
		System.out.println( temp );
	
		temp = "010-1234-5678";
		temp = temp.replaceAll("[^0-9]" , "");
		System.out.println(temp);
		
		
		
	}
}
