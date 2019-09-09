import java.lang.reflect.Array;
import java.util.ArrayList;

class EmpData {
	private ArrayList elist;
	private int[] numbers;
	private String name;

	public EmpData() {
		elist = new ArrayList();
		numbers = new int[10];
		name = "아무개";
	}

	public ArrayList getElist() {
		return elist;
	}

	public void setElist(ArrayList elist) {
		this.elist = elist;
	}

	public int[] getNumbers() {
		return numbers;
	}

	public void setElist(int[] numbers) {
		this.numbers = numbers;
	}
}

public class Ex04_ArrayList_Parameter {
	public static void main(String[] args) {
		EmpData empData = new EmpData();

		System.out.println(empData.getElist());
		ArrayList list = new ArrayList();
		list.add(100);
		list.add(200);
		list.add(300);
		empData.setElist(list);
		System.out.println(empData.getElist());
		System.out.println(empData.getNumbers());
	}
}
