package study122201;

import java.text.DecimalFormat;
import java.util.Scanner;

public class buyer {
	int member_num; //ȸ����ȣ
	String member_name; //ȸ�� �̸�
	int expend; // ���ұݾ�
	mart[] basket; // ��ٱ���
	int cnt;// ��ٱ��� ����
	
	
	buyer(){}
	buyer(int num, String name){
		this.member_name=name;
		this.member_num=num;
	}
	
	@Override
	public String toString() {
		String out ="\n============ ��ٱ��� ===============\n"+
				"ȸ����ȣ : "+member_num+"  ȸ���� : "+member_name+"\n"+
	                  "��ٱ��� ��� \n";
		for(int i=0; i<basket.length; i++) {
			out += (i+1)+". "+basket[i] +"\n";
		}
		out += "�� ���� �ݾ� : "+ total_price();
		return out;
	}
	
	String total_price() {
		//��ٱ��Ͽ� ����ִ� ������ �ѱݾ� ���ϰ� õ���� �޸��� ��ȯ�Ͽ� return �ϼ���
		int total=0;
		for(int i=0; i<basket.length; i++) {
			total += basket[i].price;
		}
		
		DecimalFormat df = new DecimalFormat("###,###");
		return df.format(total)+"��";
	}
	
	void basket_add( mart item ) {
		if( cnt >= 1) {
			mart[] temp = new mart[ basket.length + 1 ];//���� �迭���� 1 ������ �迭����
			
			for(int i=0; i<basket.length; i++) {
				temp[i] = basket[i]; // ���� �迭�� ���� ���ο� �迭�� �Ѱ��ֱ�
			}
			basket = temp; // ���ο� �迭�� �ּҸ� �޾Ƽ�  ���� �迭 ������
		}
		basket[cnt] = item;
		cnt++;
	}
	
	void payment() { // ��ٱ����� ���� ���� ����, ��� ����, basket�迭 ����  
		expend =  Integer.parseInt( total_price().replaceAll("[^0-9]", "") );
		
		System.out.println( "���� �ݾ��� "+total_price()+" �Դϴ�.");
		basket=null; // ��ٱ��� ����
	}
	
	void basket_remove() {
		
		Scanner scan = new Scanner(System.in);
		System.out.println( this );
		System.out.print("���� �� ���� ��ȣ �Է� : ");
		int num = scan.nextInt();
		
		for(int i=num; i< basket.length; i++) {
			basket[i-1] = basket[i];			
		}
		mart[] temp = new mart[basket.length -1];
		for( int i=0; i<temp.length; i++) {
			temp[i] = basket[i];
		}
		basket=temp;
	}
	
	
}



