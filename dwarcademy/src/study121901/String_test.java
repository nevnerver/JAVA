package study121901;

public class String_test {
public static final String blue="\u001B[34m";
public static final String end = "\u001B[0m";
	public static void main(String[] args) {
		
		//
		String song = "���� �ٳ��� �˷��� ������ �׷��� ���� �ٳ��� ������";
		
		// 1. ������ ���� �ϰ� ��� �ٳ����� �������� �����Ͽ� ����ϼ���
		// 2. ���� �˷��� �ִ� ������, � ���Ͽ� �˷��� �ִ��� ����ϼ���
		//    ( �˷��� ���ڿ� ���� ���� �̸��� ���� )
		// 3. song ���ڿ� �տ�  "��� �ص� ������ ����" ���ļ� �ϳ��� ���ڿ��� ����ϼ���
		
		String temp = song.replaceAll("�ٳ���", "������");
		System.out.println( temp );
		
		String fruit = song.substring(song.indexOf(" ")+1 ,  song.indexOf("�˷���") );
		System.out.println( fruit );
		
		temp = "��� �ص� ������ ����";
		System.out.println(  temp.concat(song)  );
		
		//����
		song = "ũ������������ ���� ���� ���F �ʾƿ� # ���� ���ϴ°� �� �ϳ����� # "
				+"Ʈ�� �Ʒ��� ���� �����͵� �Ű澲�� �ʾƿ� # ����� ���ؿ� #"
				+"����� �����ϴ� �ͺ��� �� # �� �ҿ��� �̷���� #"
				+ "���� ũ���������� ���ϴ°� ����̿���";
		System.out.println("���� :" + song +"\n" );
		
		String song1 = song.replaceAll("#", "\n");
		System.out.println( song1 );
		String[] song2 = song.split("#");
		for( String sng : song2)
			System.out.println(sng);
		
		String song3 = song1.replaceAll("���", "�״�");
		System.out.println("\n\n"+song3+"\n");
		
		String song4 = song1.replaceAll("ũ��������", "christmas");
		System.out.println(song4.toUpperCase()+ "\n\n");
		
		String[] song5 = song.split("#");
		System.out.println( song5[3].trim()  );
		
/*
 *   1. # �������� ���پ� ��� �ϼ���( #��  ���â�� ������ �ȵǿ�)
 *   2. ��� �̶�� �ܾ� ���  "�״�" ��� �ٲپ ����ϼ���
 *   3. ũ����������  ����� �����Ͽ� ����ϼ���(�빮�ڷ�)
 *   4. ����°#���� ���簡 �������� ����ϼ���.
 * 
 * 
 */
	}

}