class MobliePhone {
	protected String number;

	public MobliePhone(String number) {
		this.number = number;
	}

	public void answer() {
		System.out.println("Hi ~from " + number);
	}
}

class SmartPhone extends MobliePhone {
	private String androidVer;

	public SmartPhone(String number, String ver) {
		super(number);
		androidVer = ver;
	}

	public void playAdd() {
		System.out.println("App is running in " + androidVer);
	}
}

public class MoblieSmartPhone {
	public static void main(String[] args) {
		SmartPhone phone = new SmartPhone("010-555-777", "Nuget");
		phone.answer();
		phone.playAdd();
	}
}
