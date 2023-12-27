package study121901;

import java.util.Arrays;
import java.util.Scanner;

public class String_method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String word="i like banana chacha";
		
		// 1. ���ڿ����� Ư�� ���� ���� - charAt()
		char ch = word.charAt(2);
		System.out.println( ch );
		
		Scanner scan = new Scanner(System.in);
		ch = scan.next().charAt(0);
		System.out.println(  ch );
		
		// 2. ���ڿ� �� - equals()
		if(  word.equals("i like") )
			System.out.println("����");
		else
			System.out.println("�����ʴ�");
		
		// 3. ���ڿ��� byte�� ��ȯ - getBytes() - ���� �ҷ�����
		byte[] code = word.getBytes();
		System.out.println( Arrays.toString( code ) );
		
		// 4. ���ڿ����� Ư�� ���ڿ��� ��ġ�� ���� - indexOf()
		 int k = word.indexOf('k');
		 System.out.println( k );
		 int banana = word.indexOf("banana");
		 System.out.println( banana );
		 
		 int a5 = word.indexOf('a', 10);
		 System.out.println( a5 );
		 int cha = word.indexOf("ch", 15);
		 System.out.println( cha );
		 
		 // 5. ���ڿ��� ���� - length()
		 int len = word.length();
		 System.out.println("���ڿ� ���� : " + len);
		 
		 // 6. ���ڿ� ����(ġȯ) - replace()
		 String temp = word.replace("banana chacha", "rescue tayo");
		 System.out.println("���� : " + word );
		 System.out.println("������ : " + temp);
		 
		 // �ڹٽ�ũ��Ʈ����  ����ǥ������ �̿��Ͽ� ���ڿ� ����
		 // �ڹٿ����� ����ǥ������ ����Ѵ�.
		 //  [^0-9]
		 // Ư���������� [^��-����-�Ӱ�-Ra-zA-Z0-9]
		 
		 temp = word.replaceAll("a.","c" );
		 System.out.println( temp );
		 
		 temp = "010-1234-5678";
		 temp = temp.replaceAll("[^0-9]", "");
		 System.out.println( temp );
		 
		 // 7. ���ڿ� ���� - substring
		 
		 temp = word.substring(5);
		 System.out.println( temp );
		 
		 temp = word.substring(7, 15);
		 System.out.println( temp );
		 
		 temp = "skyblue@gmail.com";
		 // ���̵��  ���л���Ʈ�ּ� �˾Ƴ���
		 String id = temp.substring(0, temp.indexOf("@") );
		 System.out.println("���̵� : "+id);
		 
		 String url = temp.substring( temp.indexOf("@")+1 );
		 System.out.println( url );
		 
		 temp = "���������� �߱� �߾ӷ� 121���� 20";
		 // �� �ּҿ��� ���ø��  ���θ� �� ����ϼ���
		 String city = temp.substring(0, temp.indexOf(" "));
		 String road = temp.substring( temp.indexOf(" ", city.length()+1)+1  );
		 
		System.out.println(city+"  "+ road);
		
		// 8. ���ڿ� �и� - split() , �ϳ��� ���ڿ��� ������ ���ڱ������� �迭�� ����,
		String[] str = word.split(" ");
		System.out.println( Arrays.toString( str ));
		temp = "010-1234-5678";
		String password = temp.split("-")[2];
		
		temp = "12 �� 4570";
		String[] car = temp.split(" ");
		if( car[2].equals( "4570" ) ) {
			System.out.println("������ ����");
		}else if( car[0].equals( "12" ) ) {
			System.out.println( "������ ����");
		}
		
		// 9. �빮��, �ҹ��� ��ȯ - toLowerCase(), toUpperCase()
		temp = word.toUpperCase();
		System.out.println("�빮�� : " +temp);
		
		temp = temp.toLowerCase();
		System.out.println("�ҹ��� : " +temp);
		
		// 10. ���ڿ��� ���ڿ��� ���� - concat()
		word = "���� �����ϴ� �뷡 : ";
		temp = "�ٳ��� �˷��� ������";
		String song = word.concat(temp);
		System.out.println( song );
		
		// 11. String ���������� ������ Ȯ��( ���ڿ��� �ֳ� ����) - isEmpty()
		System.out.println(  word.isEmpty() );
		
		// 12. ���ڿ���  Ư�� ���� �Ǵ� ���ڿ� ���� ���� - contains()
		System.out.println(  temp.contains("������")  );
		
		// 13. Ư�� ���ڷ� ����, ���������˻� - startsWith() , endsWith()
		System.out.println(  word.startsWith("����") );
		
	}

}