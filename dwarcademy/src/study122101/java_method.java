package study122101;

import java.util.Scanner;

public class java_method {

	static Scanner scan = new Scanner(System.in);
	
	//static - Ŭ����(static) �޼��忡����  ���� static������, static �޼��常 ��� ����
	//        static �޼��忡�� �ν��Ͻ������� �ν��Ͻ� �޼���� ��� �Ұ�
	
	public static void search( student[] std , String  name ) { // �̸����� �˻��Ͽ� ���� ��ȸ
		boolean isStd = false;
		
		for( int i=0; i<std.length; i++) {
			if( std[i].name.equals(name) ) {
				System.out.println( std[i] );
				isStd=true;
			}
		}
		if( !isStd )
			System.out.println("��ϵ��� ���� �л� �Դϴ�.");
	}
	
	public static void main(String[] args) {
		
		student[] std = new student[6]; // �������� 6�� ���� ����
		std[0] = new student("�̼���",86,95,67);
		std[1] = new student("������",94,84,55);
		std[2] = new student("�庸��",78,34,76);
		std[3] = new student("�̼���",98,55,46);
		std[4] = new student("�����",100,99,87);
		std[5] = new student("������",76,56,100);
		
		System.out.print("��ȸ�� �л� �̸� �Է� : ");
		String name = scan.nextLine();
		
		search( std, name  );
		
		
		
//		std[0].calc();
		
		//System.out.println(  std[0] );
		
//		student s = new student(); 
//		
//		student std = new student("�̼���",86,95,67); //studentŬ���� ��ü�� �����ؼ� �������� std�� ����
////
//		System.out.println( std );
//		std.name="�̼���";
//		std.kor=86;
//		std.mat=95;
//		std.eng=67;

	}

}