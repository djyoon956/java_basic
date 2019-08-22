class Boat {
	void myCar() {
		System.out.println("This is my boat");
	}
	
	public static void main(String[] args) {
		System.out.println("Boat class");
		Car c = new Car();
		c.myCar();
		Boat t = new Boat();
		t.myCar();
	}
}