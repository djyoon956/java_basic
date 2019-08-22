
public class ex_190822 {
	public static void main(String[] args) {

		if (Clothes.getCapital() >= 10000) {
			Clothes clothes1 = new Clothes("나이키", "바지", 9000);
			clothes1.printClothesInfo();

			clothes1.sales();

			System.out.printf("총 판매 갯수 : %d\n", Clothes.getSoldcount());
			System.out.printf("총 판매 금액 : %d\n", Clothes.getTotalsales());
			System.out.printf("보유중인 옷 갯수 : %d\n", Clothes.getPossessioncount());
			System.out.printf("보유 자산 : %s\n", Clothes.getCapital());

		} else
			System.out.println("자산이 부족합니다.");
	}
}
