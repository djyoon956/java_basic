
import kr.or.bit.Fclass;
import kr.or.bit.Tv;

public class Ex02_Method {
	public static void main(String[] args) {
		Fclass f1 = new Fclass();
		int input = 200;

		f1.m();

		f1.m2(100);

		f1.m2(input);

		System.out.println("f1.m3 return value : " + f1.m3());

		System.out.println("f1.m4 return value : " + f1.m4(input));

		System.out.println("f1.sum return value : " + f1.sum(1, 2, 3));

		System.out.println("f1.sum2 return value : " + f1.sum2(-10));

		System.out.println("f1.Concat return value : " + f1.Concat("111", "222", "333"));

		Tv tv = f1.objMethod();
		System.out.println("tv : " + tv);
		System.out.println("tv.brand : " + tv.brand);
		Tv tv2 = f1.objMethod();
		System.out.println("tv2 : " + tv2);
		System.out.println("tv.equals(tv2)" + tv.equals(tv2));
		Tv tv3 = f1.objMethod3(tv2);
		System.out.println("tv3.equals(tv2" + tv3.equals(tv2));
	}
}
