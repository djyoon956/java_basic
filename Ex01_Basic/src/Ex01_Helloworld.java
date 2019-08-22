import kr.or.bit.Emp;
public class Ex01_Helloworld{
	public static void main(String[] args) {
		/*
		 System.out.println("Hello world"); kr.or.bit.Emp emp = new
		  kr.or.bit.Emp();
		 */
		Emp emp = new Emp(); // 사원 한명을 생성합니다.
		emp.empno = 7777;
		emp.ename = "홍길동";
		emp.job = "IT";
		
		String str = emp.getEmpInfo();
		System.out.println(str);
		
		Emp emp2 = new Emp(); // 사원 한명을 생성합니다.
		emp2.empno = 8888;
		emp2.ename = "아무개";
		emp2.job = "sales";
		
		String str2 = emp2.getEmpInfo();
		System.out.println(str2);
	}
	
}
