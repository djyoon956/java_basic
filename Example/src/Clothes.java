
public class Clothes {
	private int price; // ����
	private String brand; // �귣��
	private String kind; // ����

	private static int soldcount; // �� �ǸŰ���
	private static int totalsales; // �� �Ǹűݾ�
	private static int possessioncount; // �����ϰ� �ִ� ����
	private static int capital; // �ڻ�

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
		System.out.printf("�귣�� : %s, ���� : %s, ���� : %d\n", brand, kind, price);
	}
}