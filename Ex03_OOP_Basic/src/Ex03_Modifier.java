import kr.or.bit.Car;

/*
������(������) : modifier
public (���� : package ����(����) ���о��� ��� �ڿ� ����)
private (���� : Ŭ���� ���� ���� �ڿ�, ��ü ���忡���� ���� �Ұ�(��� �Ұ�))

��ü���� ����� Ư¡
1. ĸ��ȭ(����ȭ)
1.1 Ŭ���� ���ο� �ִ� �ڿ�(member field, method) ����
	private int number; // instance variable
	private void call(){...} // ����(Ŭ����)������ ����ϴ� �����ڿ�

1.2 ĸ��ȭ why? private why ����ұ�?
	 >> ���� �Ҵ��� ���� ���� �Ҵ��� ���� �ڿ��� ��ȣ�Ѵ�.
	[�����Ҵ�]
	public class Car{public int door;} >>  Car car = new Car(); car.door=10;
	
	[�����Ҵ�] >> �Լ�
	public class Car{
	private  int door; 
	public void writeDoor(int data){
	
	 if(data>=0)
	 	 door= data;
 	 else
 	 	door=0;
	 }} >>  Car car = new Car(); car.writeDoor(10);
	 
	 
	 private int number;
	 >> �׷��� �ڹٿ����� Ư���� ������ �Լ��� �������. (ĸ��ȭ�� �ڿ��� ���ؼ� read, write �� �� �ֵ� ���� �Լ�)
	 setter �Լ�, getter �Լ�
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
