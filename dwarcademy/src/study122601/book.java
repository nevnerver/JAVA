package study122601;

public class book {

	static int cnt=0;  // Ŭ���� ���� 
	
	private String title;   // �ν��Ͻ�����
	String writer;  // �ν��Ͻ�����
	final int book_num; // �ν��Ͻ� ���
	
	
	book(){ // �����ڸ޼���
		book_num=10;
	}
	
	
	public static int getCnt() {
		return cnt;
	}


	public static void setCnt(int cnt) {
		book.cnt = cnt;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getWriter() {
		return writer;
	}


	public void setWriter(String writer) {
		this.writer = writer;
	}


	public int getBook_num() {
		return book_num;
	}


	static void init() { // Ŭ���� �޼���
		System.out.println("å ��� ����");
	}
	
	void create() {  // �ν��Ͻ� �޼���
		title="c���";
		System.out.println("å ���");
	}
	
}
// �ν��Ͻ�������  �ν��Ͻ�(��ü)�����ؾ����� ����Ҽ� �ִ� ������.

