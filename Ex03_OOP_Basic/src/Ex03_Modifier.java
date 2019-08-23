import kr.or.bit.Car;

/*
접근자(한정자) :modifier
public (공유 : package 구분(폴더) 구분없이 모든 자원 공유)
private(개인 : 클래스 내부 공유자원 , 객체 입장에서는 접근 불가(사용불가))

객체지향언어 특징
1. 캡슐화(은닉화)
1.1 클래스 내부에 있는 자원(member field , method) 적용 
    private int number; //instance variable
    private void cal(){} // 내부(클래스)에서만 사용하는 공통자원
1.2 캡슐화를 why ? , private why 사용할까 ?
       [ 직접할당을 막고 간접할당을 통해서 자원 보호 ]
       
       [직접할당]
       public class Car { public int door; } >> Car c = new Car(); c.door =1;

       -1 안되요 ??
       [간접할당 : 누구를 통해서 전달하고 받는 행위] >> 누구 >> 함수
       public class Car { private int door; 
                          public void writeDoor(int data){
                          if(data >= 0) {door = data;} else{ door = 0;}}} 
                          >> Car c = new Car(); c.writeDoor(-1);

            불편해요
	  1. private int number; //read , write
	          함수를 만들면 되요(결국 read 함수 1개 , write 함수 1개) 
	     >>public void writeNumber(int data) { number = data;} //캡슐화된 자원에 write
	     >>public int readNumber(){return number;} //캡슐화된 자원에 read

	  그래서 java 에서는 특수한 목적의 함수를 만들었어요 (캡슐화된 자원에 대해서 read , write) 전용함수 ..
	 전용함수를 setter 함수(write) , getter 함수 (read)
	 
	 private int age;
	 -setter , getter 모두 생성
	 -setter 만 생성
	 -getter 만 생성
	 
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
