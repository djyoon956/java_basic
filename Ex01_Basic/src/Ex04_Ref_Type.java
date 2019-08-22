//클래스는 설계도이다. 클래스는 타입이다.
//클래스 == 설계도 == 타입
//클래스는 구체화해서 사용(집을 짓는 행위)
//프로그램 세계에서는 new를 통해 구체화 시킴(메모리에 구체화 시킴) >> 인스턴스instance, 객체

//설계도를 작성한다.
//클래스는 크게 2가지(시작점(main)을 가지는 클래스, maint함수 없는 클래스(혼자 사용하지 못함))

class Apt{
	int door=10;
	int window=100;
}
public class Ex04_Ref_Type { //maint 함수가 있는 설계도

	public static void main(String[] args) {
		//Apt라는 설계도를 가지고 구체화(아파트 짓기)
		Apt lgapt = new Apt();
		//lgapt(참조변수, 객체변수:주소를 가지고 있는 변수)
		System.out.println("주소 값 : " + lgapt);
		//lgapt 녀석이 객체의 주소를 가지는 방법(원칙적으로 new하나)
		
		Apt ssapt = lgapt; //할당도 방법중 하나다. = 아파트 열쇠를 빌려주는 것
		ssapt.door = 1111;
		System.out.println(lgapt.door);
		
	}

}
