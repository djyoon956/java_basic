
public class Clothes {
	private int price; // 가격
	private String brand; // 브랜드
	private String kind; // 종류

	private static int soldcount; // 판매 갯수
	private static int totalsales; // 판매 총액
	private static int possessioncount; // 보유 갯수
	private static int capital; // 자산

	static {
		capital = 100000;
	}

	public static int getSoldcount() {
		return soldcount;
	}

	public static int getTotalsales() {
		return totalsales;
	}

	public static int getPossessioncount() {
		return possessioncount;
	}

	public static int getCapital() {
		return capital;
	}

	public Clothes(String cbrand, String ckind, int cprice) {
		brand = cbrand;
		kind = ckind;
		price = cprice;
		possessioncount++;
		cprice -= 10000;
	}

	public void sales() {
		soldcount++;
		totalsales += price;
		possessioncount--;
	}

	public void printClothesInfo() {
		System.out.printf("옷 브랜드 : %s, 옷 종류 : %s, 옷 가격 : %d\n", brand, kind, price);
	}
}