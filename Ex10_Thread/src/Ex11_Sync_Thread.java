/*
은행 계좌를 하나 가지고 있다.
은행 계좌를 통해 입금, 출금 처리를 할 수있다.

친구 다섯명이 똑같은 카드를 복제 
동시에 계좌 출금

통장 잔액 : 1000만원

동시에 ATM에 가서 출금

*/

class Account {
	int balance = 1000;

	void withDraw(int money) {
		System.out.println("고객 : " + Thread.currentThread().getName());
		System.out.println("현재 잔액 : " + balance);

		if (balance >= money) {
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}

			balance -= money;
		}

		System.out.println("인출 전 금액 : " + money);
		System.out.println("인출 후 금액 : " + balance);
	}
}

class Bank implements Runnable {
	Account acc = new Account();

	@Override
	synchronized public void run() {
		while (acc.balance > 0) {
			int money = ((int) (Math.random() * 3) + 1) * 100;
			acc.withDraw(money);
		}
	}
}

public class Ex11_Sync_Thread {
	public static void main(String[] args) {
		Bank bank = new Bank();
		Thread t1 = new Thread(bank, "Kim");
		Thread t2 = new Thread(bank, "Lee");
		Thread t3 = new Thread(bank, "Park");

		t1.start();
		t2.start();
		t3.start();
	}
}
