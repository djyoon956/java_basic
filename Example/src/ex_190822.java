
public class ex_190822 {
	public static void main(String[] args) {

		if (Clothes.getCapital() >= 10000) {
			Clothes clothes1 = new Clothes("����Ű", "����", 9000);
			clothes1.printClothesInfo();

			clothes1.sales();

			System.out.printf("�� �Ǹ� ���� : %d\n", Clothes.getSoldcount());
			System.out.printf("�� �Ǹ� �ݾ� : %d\n", Clothes.getTotalsales());
			System.out.printf("�������� �� ���� : %d\n", Clothes.getPossessioncount());
			System.out.printf("���� �ڻ� : %s\n", Clothes.getCapital());

		} else
			System.out.println("�ڻ��� �����մϴ�.");
	}
}
