class Car {
	void myCar() {
		System.out.println("This is my car");
	}

	public static void main(String[] args) {
		System.out.println("Car class");
		Car c = new Car();
		c.myCar();
		Boat t = new Boat();
		t.myCar();
	}
}