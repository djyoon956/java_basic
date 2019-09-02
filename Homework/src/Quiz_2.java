// singletone
// new를 하지 못하게하고, 여러번 해도 하나의 객체만 소유한다.
class Singletone {
	private static Singletone singletone;

	private Singletone() {
	}

	public static Singletone getSingletone() {
		if (singletone == null)
			singletone = new Singletone();

		return singletone;
	}
}

public class Quiz_2 {
	public static void main(String[] args) {
		System.out.println(Singletone.getSingletone().equals(Singletone.getSingletone()));
	}
}
