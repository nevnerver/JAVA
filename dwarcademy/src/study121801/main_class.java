package study121801;

import java.util.Arrays;

public class main_class {

	public static void main(String[] args) {
	
		// �ڹٽ�ũ��Ʈ - let a = new Array(10);
		//             let b = [10,20,30,40];
		//       a.push(3123);   b.push(233);
		
		int[] arr1 = {101,20};
		
		System.out.println( arr1[0] );
		
		int[] arr2 = new int[10];
		// new int[10]
		// (new)���ο����  int(����Ÿ��)[10](10�����������λ���)
		
		for( int i=0; i<arr2.length; i++ ) {
			arr2[i]= i*10;
		}
		System.out.println( arr2[2] );
		
		for( int i=0; i<arr2.length; i++) {
			System.out.println( arr2[i] );
		}
		
		// �ڹٿ��� �⺻ �迭�� �����Ͽ� �ٷ궧
		// �迭�� ������ ������ ���ϱ�( ���� ������ ���� ������ Ÿ�� ���ؾ���)
		// ��� �����͸� �����Ұ����� ���� ���ϱ�
		// Ÿ�԰� ������ �´� �迭 ���� 
		// Ÿ�� - ���ڿ�,  ����-7
		// String[] names = new String[7];
		
		// 10���� �л� ������ ���� �� �迭 �����
		int[] score = new int[10];
		
		for(int i=0; i<score.length; i++) {
			score[i] = (int)(Math.random()*51)+50;
		}
		System.out.println( Arrays.toString(score) );
		
		Arrays.sort(score);
		System.out.println(Arrays.toString(score) );
		
		// �ΰ��� �迭�� ����Ȱ��� �ϳ��� �迭�� ��ġ��
		int[] a= {10,20,30,40};
		int[] b= new int[] {11,22,33,44};
		int[] c = new int[8];
//		for( int i=0; i<a.length; i++) {
//			c[i] =a[i];
//			
//			c[i+4] = b[i];
//		}
// arraycopy(������迭 , ����迭�����ε��� , ���������ҹ迭, ������ġ, �����)
		System.arraycopy(a, 0, c, 0, a.length);
		System.arraycopy(b, 0, c, 4, b.length);
		
		System.out.println( Arrays.toString(c) );
		
		
		int[] data = {170,168, 182, 174, 175, 169, 177};
		// data �迭���� 3�г�1���� Ű�� ���� �Ǿ� �ִ�.
		// Ű�� 175�̻� �� ��� �ϼ���.
		
		for( int i=0; i< data.length; i++) {
			if( data[i] >= 175)
				System.out.println("175�̻��л� - "+(i+1)+"��° �л� Ű :"+ data[i] );
		}
		
		
		
	}

}




