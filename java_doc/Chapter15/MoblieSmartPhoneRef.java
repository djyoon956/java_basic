class MobliePhone2 {
	protected String number;

	public MobliePhone2(String num) {
		number = num;
	}

	public void answer() {
		System.out.println("Hi~ from " + number);
	}
}

class SmartPhone2 extends MobliePhone2 {
	private String androidVer;

	public SmartPhone2(String num, String ver) {
		super(num);
		androidVer = ver;
	}

	public void play() {
		System.out.println("App is running in " + androidVer);
	}
}

public class MoblieSmartPhoneRef {
	public static void main(String[] args) {
		SmartPhone2 ph1 = new SmartPhone2("010-555-777", "Nougat");
		MobliePhone2 ph2 = new SmartPhone2("010-999-333", "Nougat");

		ph1.answer();
		ph1.play();
		System.out.println();

		ph2.answer();
		// ph2.play();
	}
}
