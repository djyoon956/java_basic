import java.util.ArrayList;

import kr.or.bit.CopyEmp;
import kr.or.bit.Emp;

class Product {
	int price;
	int bonuspoint;

	// Product() { }
	Product(int price) {
		this.price = price;
		this.bonuspoint = (int) (this.price / 10.0);
	}
}

class KtTv extends Product { // KtTv tv = new KtTv(); tv.toString();
	KtTv() {
		super(500);
	}

	// KtTv(int price){ super(price);}
	// 이름 리턴 하는 기능
	@Override
	public String toString() {
		return "KtTv";
	}

}

class Audio extends Product { // KtTv tv = new KtTv(); tv.toString();
	Audio() {
		super(100);
	}

	// KtTv(int price){ super(price);}
	// 이름 리턴 하는 기능
	@Override
	public String toString() {
		return "Audio";
	}

}

class NoteBook extends Product { // KtTv tv = new KtTv(); tv.toString();
	NoteBook() {
		super(150);
	}

	// KtTv(int price){ super(price);}
	// 이름 리턴 하는 기능
	@Override
	public String toString() {
		return "NoteBook";
	}

}

public class Ex07_Generic_Quiz {
	public static void main(String[] args) {
		// 1. Array(배열) 을 사용해서 Cart 만들고 제품(Tv, Audio , Notebook)
		Product[] cart = new Product[3]; // 다형성
		cart[0] = new KtTv();
		cart[1] = new Audio();
		cart[2] = new NoteBook();

		// 2.ArrayList 를 사용해서 Cart 만들고 제품(Tv, Audio , Notebook)
		// 단 generic 사용
		ArrayList<Product> pcart = new ArrayList<Product>();
		pcart.add(new KtTv());
		pcart.add(new KtTv());
		pcart.add(new KtTv());
		pcart.add(new NoteBook());

		for (Product product : pcart) {
			System.out.println(product.toString());
		}

		// 3. Emp 클래스를 사용해서 사원 3명을 만드세요
		// 단 ArrayList<E> 사용하세요
		ArrayList<Emp> emplist = new ArrayList<Emp>();
		emplist.add(new Emp(1000, "김씨", "IT"));
		emplist.add(new Emp(2000, "박씨", "SALES"));
		emplist.add(new Emp(3000, "이씨", "MANAGER"));

		// 2.사원의 정보 (사번, 이름, 직종)을 개선된 for문을 사용해서 출력하세요
		// 단 toString() 사용 금지
		for (Emp emp : emplist) {
			System.out.println(emp.getEmpno() + "/" 
		                     + emp.getEname() + "/" 
					         + emp.getJob());
		}

		// 3.사원의 정보 (사번, 이름, 직종)을 일반 for문을 사용해서 출력하세요
		// 단 toString() 사용 금지
		for (int i = 0; i < emplist.size(); i++) {
			System.out.println(
					emplist.get(i).getEmpno() + "/" 
			      + emplist.get(i).getEname() + "/" 
				  + emplist.get(i).getJob());
			
		}

		// 4.CopyEmp 라는 클래스를 만드세요(Emp 와 같은데)
		// job member field 대신에 >>
		// private int sal; 로 바꾸어서 만드세요(getter ,setter 구현)
		// kr.or.bit.CopyEmp 로 하세요
		// ArrayList<> 제너릭 사용해서 사원 3명 만드세요
		// 아래 데이터 사용
		// 100,"김",1000
		// 200,"이",2000
		// 300,"박",3000
		ArrayList<CopyEmp> clist = new ArrayList<>();
		clist.add(new CopyEmp(100, "김", 1000));
		clist.add(new CopyEmp(200, "이", 2000));
		clist.add(new CopyEmp(300, "박", 3000));
		// 5.200번 사원의 급여를 5000으로 수정해서 출력하세요(일반 for문 안에서 ....)
		for (int i = 0; i < clist.size(); i++) {
			if (clist.get(i).getEmpno() == 200) {
				clist.get(i).setSal(5000);
				System.out.println(clist.get(i).toString());
			}
		}

		// 6.300번 사원의 이름을 "궁금해" 로 수정해서 출력하세요(개선된 for문 안에서 ....)
		for (CopyEmp emp : clist) {
			if (emp.getEmpno() == 300) {
				emp.setEname("궁금해");
				System.out.println(emp.toString());
			}
		}

	}

}


