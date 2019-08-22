import lib.Person;

public class ConOverloading {
	public static void main(String[] args) {
		Person jung = new Person(335577, 112233);
		Person hong = new Person(335577);

		jung.showPersonalInfo();
		hong.showPersonalInfo();
	}
}
