package study122102;

public class music {
	
	static int count=0; //Ŭ���� ���� , ������ʱ�ȭ�� 0 ����
	
	String singer; //����
	String title;  // ����
	int playing_time; //����ð�
	
	music(){} // �⺻ �����ڸ޼���
	music(String ����, String ����){ // �Ű������� �ִ� ������ �޼���
		this.singer=����;
		this.title=����;
	}
	music(String singer, String title, int time){ //�Ű������� �ִ� ������ �޼���
		this(singer,title);
		this.playing_time=time;
	}
	
	
	@Override
	public String toString() {
		return "���� : "+singer+" - "+title+"("+transform()+")";
	}
	
	String transform() {
		int min = playing_time/100;
		int sec = playing_time%100;
		
		return min+":"+sec;
	}
}


//	int a=456;
//	Integer.toString(a).charAt(0)//substring(0,1);