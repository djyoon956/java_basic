package kr.or.bit;

//D(data)T(transfer)O(object)
public class Emp {
	private int empno;
	private String ename;

	public Emp() {

	}

	public Emp(int empno, String ename) {
		this.empno = empno;
		this.ename = ename;
	}

	public int getEmpno() {
		return empno;
	}

	public void setEmpno(int empno) {
		this.empno = empno;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	// 정보 출력 기능
	public void empInfoPrint() {
		System.out.println(this.empno + "/" + this.ename);
	}
}
