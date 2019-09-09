import java.util.ArrayList;

import kr.or.bit.Emp;

public class Ex03_ArrayList_Object_KeyPoint {
	public static void main(String[] args) {
		// Array
		// 사원 한명을 만드세요.
		Emp emp = new Emp(100, "김유신", "군인");
		System.out.println(emp.toString());

		// Array 사용해서 사원 2명 생성.
		Emp[] empArrays = { new Emp(10, "김유신", "군인"), new Emp(20, "홍길동", "도적") };
		for (Emp e : empArrays)
			System.out.println(e.toString());

		//
		ArrayList emps = new ArrayList();
		emps.add(new Emp(1, "김", "it"));
		emps.add(new Emp(2, "박", "it"));
		System.out.println(emps);

		// for문을 사용해서 사용 데이터출력
		for (int i = 0; i < emps.size(); i++) {
			// System.out.println(emps.get(i));
			Emp e = (Emp) emps.get(i);
			System.out.println(e.getEmpno() + "/" + e.getEname() + "/" + e.getJob());
		}

		for (Object object : emps) {
			Emp e = (Emp) object;
			System.out.println(e.getEmpno() + "/" + e.getEname() + "/" + e.getJob());
		}
		System.out.println("*******************************");
		ArrayList<Emp> emps2 = new ArrayList<Emp>();
		emps2.add(new Emp(1, "김", "it"));
		emps2.add(new Emp(2, "박", "it"));

		for (int i = 0; i < emps2.size(); i++) {
			// System.out.println(emps.get(i));
			Emp e = emps2.get(i);
			System.out.println(e.getEmpno() + "/" + e.getEname() + "/" + e.getJob());
		}

		for (Emp e : emps2)
			System.out.println(e.getEmpno() + "/" + e.getEname() + "/" + e.getJob());
	}

}
