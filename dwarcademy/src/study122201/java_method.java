package study122201;

import java.util.Scanner;

public class java_method {
	static Scanner scan = new Scanner(System.in);
	static mart[] mart_list;
	
	public static void main(String[] args) {
		
		mart_init();  // ��ǰ����� ù��° ���� �Ǿ�� �Ѵ�.  
		
		buyer �踲 = buyer_enroll(); // ������ ��� (buyer Ŭ���� ��ü ����)
		
		put(�踲); // ������ �����ϱ� ���� �޼���, ���̻� ���������ʾƾ� �޼��尡 ����ȴ�.
		
		buy(�踲);
		
		
	}
	static void buy( buyer �踲) {
		while(true) {
			System.out.println( �踲 );
			
			System.out.print("��ٱ����� ���ǵ��� ���� �Ͻ� �ڽ��ϱ�?(y/n) : ");
			char yn = scan.nextLine().charAt(0);
			if( yn=='y' || yn=='Y') { //���� ��ٱ����� ��繰�� ���Ž�
				�踲.payment();
				break; // ���� �Ϸ� �ϸ� buy �޼��� ����
			}else { // ���� ���� - �屸�Ͽ��� ���� 
				�踲.basket_remove();
			}
		}
	}
	
	
	static void put( buyer �踲 ) {
		
		while(true) {
			
			System.out.println("\n=============== ��� =============== \n");
			view();
			System.out.print("������ ��ȣ�� �Է��ϼ���(0-�����ߴ�) : ");
			int num = scan.nextInt();
			scan.nextLine();// ���� ������ ���ڿ� �Է½� �Է¹��۸� ����� �Ѵ�.
			
			if( num== 0) break; // �����ߴ� �ϸ�  while�� ����
			if( !(num>=1 && num <= mart_list.length) ) 
				continue; // ��ǰ��ȣ�� �߸��Է½� �ٽ� �ݺ��� ����;
			
			�踲.basket_add( mart_list[num-1] ); //��ٱ��� ũ�� ���� - �ι�° ������ ����������
			
			
			System.out.print("��ٱ��� Ȯ�� �Ͻðڽ��ϱ�? (y/n) : ");
			char yn = scan.nextLine().charAt(0);
			if( yn == 'y' || yn == 'Y') {
				System.out.println( �踲 );
			}
		}
	}
	

	
	
	static buyer buyer_enroll() {
		
		int num = (int)(Math.random()*40000)+10000;
		System.out.print("������ ������ �Է��ϼ��� : ");
		String name = scan.nextLine();
		
		buyer ���踲 = new buyer(num, name);
		���踲.basket= new mart[1]; 
		// ��ٱ��� ���� 1�� ���� - ���� ��ǰ�� ��ٱ��Ͽ� �����鼭 �þ�� ����
		return ���踲;
	}
	
	static void view() {
		for(int i=0; i< mart_list.length; i++) {
			System.out.println( (i+1) +". " + mart_list[i] );
		}
	}
	
	static void mart_init() {
		mart_list= new mart[] {
			new mart("������ġ",2890, "������",2100 ) , new mart("Ȩ����",1300, "����",4231),
			new mart("���̺�4����",5890,"��",450), new mart("�Ŷ��1����",4300,"���",5234),
			new mart("¥�İ�Ƽ1����",6430,"���",5132), new mart("�޹�(6��)",6700,"�Ｎ��ǰ",312),
			new mart("����������",1560,"�Ｎ��ǰ",1145), new mart("��ä��ġ",2450,"������",3123),
			new mart("�����",2710,"������",1365),new mart("���±�",1350,"����",4615),
			new mart("���丶��",30000,"����",128), new mart("�ߺ� �������",31000,"����",1232)
				
		};
		
	}
	
	
}


