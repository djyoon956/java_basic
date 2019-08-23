import lib.Clothes;

public class ex_190822 {
	public static void main(String[] args) {
		Clothes clothes1 = new Clothes("아디다스", "바지", 9000);
		clothes1.printClothesInfo();

		clothes1.sales();

		System.out.printf("판매 갯수 : %d\n", Clothes.getSoldcount());
		System.out.printf("판매 총 액 : %d\n", Clothes.getTotalsales());
		System.out.printf("보유 갯수 : %d\n", Clothes.getPossessioncount());
		System.out.printf("현재 자산 : %s\n", Clothes.getCapital());
	}
}
