import lib.Box6;

public class BoxArray {
	public static void main(String[] args) {
		Box6[] ar = new Box6[3];
		ar[0] = new Box6("First");
		ar[1] = new Box6("Second");
		ar[2] = new Box6("Third");

		System.out.println(ar[0]);
		System.out.println(ar[1]);
		System.out.println(ar[2]);
	}
}
