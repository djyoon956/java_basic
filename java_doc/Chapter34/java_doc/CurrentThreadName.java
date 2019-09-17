package java_doc;

public class CurrentThreadName {
	public static void main(String[] args) {
		Thread ct = Thread.currentThread();
		String name = ct.getName(); // return Thread name
		System.out.println(name);
	}
}
