package study122102;

public class music {

	static int count=0; //Ŭ���� ����, ������ʱ�ȭ�� 0 ����
	
	String singer; //����
	String title; //����
	int playing_time; //����ð�
	
	music(){} // �⺻ ������ �޼���
	music(String ����, String ����){ //�Ű������� �ִ� ������ �޼���
		this.singer=����;
		this.title=����;
				
	}
	music(String singer, String title, int time){ //�Ű������� �ִ� ������ �޼���
		this(singer,title);
		this.playing_time=time;
	}
	
	@Override
	public String toString() {
		return "���� : "+singer+" - "+title+"("+playing_time+")";
	}
}
