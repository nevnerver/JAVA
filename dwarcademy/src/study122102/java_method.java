package study122102;

import java.util.Scanner;

public class java_method {

	static void list_print( music[] mylist) {
		for( music obj : mylist) {
			System.out.println( obj );
		}
	}
	
	static void song_search(String keyword, music[] mylist) { // ���� �Ǵ� �뷡���� ���� �˻�
		
		boolean issong = false;
		for( music obj : mylist) {
			if(obj.singer.equals(keyword) || obj.title.equals(keyword) ) {
				System.out.println( obj );
				issong=true;
			}
		}
		if(	!issong	)
			System.out.println("�˻� ��� ����");
	}
	
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		music[] mylist = new music[] {
			new music("��Ŵ","���ݾ�",328), new music("ž��","ȣ��������",441),
			new music("�ٺ�ġ","���´���",332),new music("����","�����",445),
			new music("�����","�鸮����",359),new music("�ٺ�ġ","��� �����",332),
			new music("Ȳġ��","���� ������",442),new music("��θ���","������",529),
			new music("������","�Ʒ���",405),new music("������","�� ���� ���",315),
		};
		
		list_print(mylist);
		
		System.out.print("���� �Ǵ� �뷡���� : ");
		String keyword = scan.nextLine();
		song_search(keyword,mylist);
	}

}


