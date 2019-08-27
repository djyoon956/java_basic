import java.util.Arrays;

import javax.naming.event.NamespaceChangeListener;

class Person {
	String name;
	int age;

}

public class Ex04_Array_Object {
	public static void main(String[] args) {
		int[] intarr = new int[10];
		boolean[] boarr = new boolean[5];
		System.out.println(Arrays.toString(boarr));

		Person[] persons = new Person[3];
		System.out.println("persons : " + persons);
		System.out.println("new Person[3] : " + persons[0]);

		// **클래스 (객체) 배열은 방을 만드는 작업과 방 안을 채우는 작업은 별도로 **
		// 2번 작업

		persons[0] = new Person();
		persons[0].name = "홍길동";
		persons[0].age = 100;
		System.out.println("persons[0] : " + persons[0]);

		persons[1] = new Person();
		persons[2] = new Person();

		System.out.println(Arrays.toString(persons));

		for (int i = 0; i < persons.length; i++) {
			System.out.println(persons[i].name + "/" + persons[i].age);
		}

		Person[] parrays = new Person[5];
		for (int i = 0; i < parrays.length; i++) {
			parrays[i] = new Person();// memory 할당
			System.out.println("주소값 : " + parrays[i]);
		}

		Person[] parray2 = new Person[] { new Person(), new Person(), new Person() };
		Person[] parray3= {new Person(), new Person(),new Person()};
	}
}
