package study122601;

public class book {

	static int cnt=0;	// Ŭ��������
	
	protected String title;	// �ν��Ͻ�����
	String writer;	// �ν��Ͻ�����
	final int book_num; // �ν��Ͻ� ���
	
	book(){ //������ �޼���
		book_num=10;
	}
	
	static void init() { //Ŭ���� �޼���
		System.out.println("å ��� ����");
	}
	
	void create() { //�ν��Ͻ� �޼���
		System.out.println("å ���");
	}
}
//	�ν��Ͻ������� �ν��Ͻ�(��ü)�� �����ؾ����� ����� �� �ִ� ������.

