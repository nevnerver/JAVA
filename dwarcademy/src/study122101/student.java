package study122101;

public class student {
	String name; // �̸� - �ν��Ͻ�����
	int kor;//����� - �ν��Ͻ�����
	int mat; //���м��� - �ν��Ͻ�����
	int eng; //���� ���� - �ν��Ͻ�����
	int total; //���� - �ν��Ͻ�����
	float avg; //��� - �ν��Ͻ�����
	
	//������ �޼���� Ŭ���������� �޼����̸��� ����Ѵ�.
	// �����ε� - �޼����� �̸��� ���ƾ��Ѵ�.
	//          �Ű������� ������ �ȵȴ�.( Ÿ���� �ٸ��ų�, �Ű����� ������ �ٸ��ų�)
	//          ������ Ŭ���������� �����ε� �� �� �ִ�.
	student(){	}
	student(String name , int k, int m , int e){
		this.name=name;
		this.kor=k;
		this.mat=m;
		this.eng=e;
		this.calc();
	}
	
	@Override
	public String toString() {
		return name+" ["+kor+" , "+mat+" , "+eng+"] ���� : "+
	              total+" ��� : "+String.format("%.1f", avg);
	}
	
	//�޼��� ���� - ��ȯŸ�� �޼����̸�(�Ű�����){  }
	void calc() { // ���� , ���
		this.total = kor+mat+eng;
		avg = total/3.0f;
	}
	
	
}