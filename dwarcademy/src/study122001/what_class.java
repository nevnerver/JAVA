package study122001;

public class what_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Ŭ������ - ����� ���� ������ Ÿ��
//			������ �⺻ ������ Ÿ���� �ƴ� ���ο� ������ Ÿ���� ���� �����ϴ� ��
//			�⺻ ������ Ÿ�԰��� �������� ���������� �����͸� �ٷ� ���� ������,
//		 	���(�޼���)�� ������ �� �ִ�.
	
//		�ڹٿ����� Ŭ���� �߽����� ������ �ؾ� �Ѵ�. ( �ݵ�ô� �ƴ� )

//		���� - ��������, �ν��Ͻ�����, Ŭ��������
//			�ν��Ͻ����� - Ŭ������ ��� ���� ( Ŭ���� ��ü�� ���� �����͸� �����ϴ� ���� )
//			Ŭ�������� - Ŭ������ �������� ( ���� ���� )
		
		car c1 = new car(); //Ŭ������ ��ü����( 
		c1.carNum=12300;
		c1.carName="�ҳ�Ÿ";
		
		System.out.println( c1 );
		
		car c2 = new car();
		c2.carNum=32433;
		c2.carName="���׽ý�";
		
		car[] c = new car[10]; // car Ŭ������ ������������ 10�� ���� 
		
		for (int i=0; i<c.length; i++ ) {
			c[i]= new car(); //car Ŭ������ ��ü ����(�ν��Ͻ������� �޼��� ��������)
		}
		
	}

}


class car{ //Ŭ�������� car�� Ŭ���� ����, Ŭ������ ���� �κ��̰� ���������� �ƴϴ�.
	int carNum; //�ν��Ͻ�����
	String carName; //�ν��Ͻ�����

	public String toString() {
		return carNum+" "+carName;
	}
	
}