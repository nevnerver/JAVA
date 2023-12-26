package study122001;

public class what_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		클래스란 - 사용자 정의 데이터 타입
//			기존의 기본 데이터 타입이 아닌 새로운 형태의 타입을 직접 정의하는 것
//			기본 데이터 타입과의 차이점은 여러종류의 데이터를 다룰 수도 있으며,
//		 	기능(메서드)을 정의할 수 있다.
	
//		자바에서는 클래스 중심으로 개발을 해야 한다. ( 반드시는 아님 )

//		변수 - 지역변수, 인스턴스변수, 클래스변수
//			인스턴스변수 - 클래스의 멤버 변수 ( 클래스 객체의 실제 데이터를 저장하는 변수 )
//			클래스변수 - 클래스의 전역변수 ( 공유 변수 )
		
		car c1 = new car(); //클래스의 객체생성( 
		c1.carNum=12300;
		c1.carName="소나타";
		
		System.out.println( c1 );
		
		car c2 = new car();
		c2.carNum=32433;
		c2.carName="제네시스";
		
		car[] c = new car[10]; // car 클래스의 참조변수공간 10개 생성 
		
		for (int i=0; i<c.length; i++ ) {
			c[i]= new car(); //car 클래스의 객체 생성(인스턴스변수와 메서드 공간생성)
		}
		
	}

}


class car{ //클래스명이 car인 클래스 정의, 클래스의 정의 부분이고 공간생성이 아니다.
	int carNum; //인스턴스변수
	String carName; //인스턴스변수

	public String toString() {
		return carNum+" "+carName;
	}
	
}