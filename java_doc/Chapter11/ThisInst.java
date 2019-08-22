import lib.SimpleBox;

public class ThisInst {
	public static void main(String[] args) {
		SimpleBox box = new SimpleBox(99);
		System.out.println(box.getData());

		box.setData(77);
		System.out.println(box.getData());
	}
}
