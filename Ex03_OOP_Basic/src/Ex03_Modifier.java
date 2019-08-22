import kr.or.bit.Car;

/*
접근자(한정자) : modifier
public (공유 : package 구분(폴더) 구분없이 모든 자원 공유)
private (개인 : 클래스 내부 공유 자원, 객체 입장에서는 접근 불가(사용 불가))

객체지향 언어의 특징
1. 캡슐화(은닉화)
1.1 클래스 내부에 있는 자원(member field, method) 적용
	private int number; // instance variable
	private void call(){...} // 내부(클래스)에서만 사용하는 공통자원

1.2 캡슐화 why? private why 사용할까?
	 >> 직접 할당을 막고 간접 할당을 통해 자원을 보호한다.
	[직접할당]
	public class Car{public int door;} >>  Car car = new Car(); car.door=10;
	
	[간접할당] >> 함수
	public class Car{
	private  int door; 
	public void writeDoor(int data){
	
	 if(data>=0)
	 	 door= data;
 	 else
 	 	door=0;
	 }} >>  Car car = new Car(); car.writeDoor(10);
	 
	 
	 private int number;
	 >> 그래서 자바에서는 특수한 목적의 함수를 만들었다. (캡슐화된 자원에 대해서 read, write 할 수 있듣 전용 함수)
	 setter 함수, getter 함수
*/
public class Ex03_Modifier {

	public static void main(String[] args) {

		Car car = new Car();
		int window = car.getWindow();
		System.out.println(window);

		car.setWindow(10);
		window = car.getWindow();
		System.out.println(window);

		car.setSpeed(-100);
		System.out.println(car.getSpeed());
		car.speedUp();
		car.speedUp();
		car.speedUp();
		car.speedUp();
		car.speedUp();
		System.out.println(car.getSpeed());
		car.speedDown();
		car.speedDown();
		car.speedDown();
		car.speedDown();
		car.speedDown();
		car.speedDown();
		car.speedDown();
		System.out.println(car.getSpeed());
	}
}
