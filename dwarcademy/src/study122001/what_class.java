package study122001;

import java.util.Arrays;

public class what_class {

	public static void main(String[] args) {
		
		member.company= "����";
		
		member m1 = new member(); // memberŬ������ �ν��Ͻ�����
		m1.age=34;
		m1.name="�̼���";
		m1.num=101;
		System.out.println(  m1 );
		m1.company="�Ｚ";
		System.out.println(  m1.company  );
		
		
		
		// Ŭ���� �� - ����� ���� ������ Ÿ�� 
		//        ������ �⺻ ������ Ÿ���� �ƴ� ���ο� ������ Ÿ���� 
		//       ���� ���� �ϴ°�, 
		//       �⺻ ������Ÿ�԰��� ��������, ���������� �����͸� �ٷ���� ������
		//       ���(�޼���)�� ���� �� �� �ִ�.
		
		// �ڹٿ����� Ŭ���� �߽����� �������ؾ� �Ѵ�.( �ݵ�ô� �ƴϰ�)
		
		// ���� - ��������, �ν��Ͻ�����, Ŭ��������
		//  �ν��Ͻ����� - Ŭ������ ��� ���� ( Ŭ���� ��ü�� ���� �����͸� �����ϴº���)
		//  Ŭ�������� - Ŭ������ �������� (���� ����)
		
//		car c1 = new car(); // Ŭ������ ��ü����( �ν��Ͻ� ���� )
//		c1.carNum=12300;
//		c1.carName="�ҳ�Ÿ";
//		
//		System.out.println( c1 );
//		
//		car c2 = new car(); 
//		c2.carNum=32433;
//		c2.carName="���׽ý�";
//		
//		System.out.println(  c2 );
//		
//		car[] c = new car[10]; // car Ŭ������ ������������ 10�� ����
//		
//		for(int i =0; i< c.length; i++) {
//			c[i] = new car();  // car Ŭ������ ��ü ����(�ν��Ͻ������� �޼��� ��������)
//			c[i].carNum = i+10000+(int)(Math.random()*10000);
//			c[i].carName="���";
//		}
//		
//		System.out.println( Arrays.toString( c ));
//		
		
	}

}


class car{  // Ŭ�������� car �� Ŭ���� ����, Ŭ������ ���� �κ��̰� ���������� �ƴϴ�.
	int carNum;  // �ν��Ͻ�����
	String carName; //�ν��Ͻ�����
	
	public String toString() {
		return carNum+"  "+ carName;
	}
}




