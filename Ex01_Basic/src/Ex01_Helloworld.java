import kr.or.bit.Emp;
public class Ex01_Helloworld{
	public static void main(String[] args) {
		/*
		 System.out.println("Hello world"); kr.or.bit.Emp emp = new
		  kr.or.bit.Emp();
		 */
		Emp emp = new Emp(); 
		emp.empno = 7777;
		emp.ename = "ȫ�浿";
		emp.job = "IT";
		
		String str = emp.getEmpInfo();
		System.out.println(str);
		
		Emp emp2 = new Emp();
		emp2.empno = 8888;
		emp2.ename = "�ƹ���";
		emp2.job = "sales";
		
		String str2 = emp2.getEmpInfo();
		System.out.println(str2);
	}
	
}
