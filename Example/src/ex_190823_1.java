import lib.CarStore;
import lib.Clothes;

 class Clothes1 {
    private static int money=1000000;
    private static int profit;
    private static int count;
    private static int sellCount;
    private String brand;
    private String kind;
    private int price;
    private int sw =1;
    
    public static int getProfit() {
        return profit;
    }
    
    public void setPrice(int price) {
        this.price = price;
    }
 
 
    public static int getMoney() {
        return money;
    }
    
    public static int getCount() {
        return count;
    }
 
    public static int getSellCount() {
        return sellCount;
    }
 
    public Clothes1(String brand, String kind, int price) {
        this.brand=brand;
        this.kind=kind;
        this.price=price;
        money-=10000;
        count++;
        sw=1;
    }
    public void sell() {
            if(sw==1) {
                sw=0;
                profit+=this.price;
                money=money+profit;
                count--;
                sellCount++;
            }else {
                System.out.println("이미 판매된 옷입니다.");
            }
                
    }
}
 


public class ex_190823_1 {
	public static void main(String[] args) {
		Clothes1 clothes1 = new Clothes1("아디다스", "바지", 9000);
		Clothes1 clothes2 = new Clothes1("아디다스", "바지", 9000);
		Clothes1 clothes3 = new Clothes1("아디다스", "바지", 9000);
		Clothes1 clothes4 = new Clothes1("아디다스", "바지", 9000);
		Clothes1 clothes5 = new Clothes1("아디다스", "바지", 9000);
		clothes1.setPrice(1000);
		clothes1.sell();
		clothes1.sell();
		clothes1.getCount();
		clothes1.getMoney();
		clothes1.getProfit();
		clothes1.getSellCount();


		System.out.printf("판매 갯수 : %d\n", clothes1.getCount());
		System.out.printf("판매 총 액 : %d\n", clothes1.getProfit());
		System.out.printf("보유 갯수 : %d\n", clothes1.getSellCount());
		System.out.printf("현재 자산 : %s\n", clothes1.getMoney());
	}
}
