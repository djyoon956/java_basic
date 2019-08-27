import kr.or.bit.Emp;

public class Ex05_Array_Object {
	public static void main(String[] args) {
		// 배열을 이용해 사원 3명을 정의
		Emp[] emps = { new Emp(1, "임도연"), new Emp(2, "윤다정"), new Emp(3, "이하연") };

		for (int i = 0; i < emps.length; i++) {
			emps[i].empInfoPrint();
		}

		// 사원 두명 생성
		Emp[] emplistEmps = new Emp[] { new Emp(1, "임도연"), new Emp(2, "윤다정") };
		for (int i = 0; i < emplistEmps.length; i++) {
			emplistEmps[i].empInfoPrint();
		}

		Emp[] emplistEmps3 = { new Emp(1, "임도연"), new Emp(2, "윤다정") };
		for (int i = 0; i < emplistEmps.length; i++) {
			emplistEmps3[i].empInfoPrint();
		}
	}
}
