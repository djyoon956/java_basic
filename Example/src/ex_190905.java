class Bank {
	private Account[] accounts;
	private int totalAccount;

	public void addAccount(String accountNo, String name) {

	}

	public Account getAccount(String account) {
		return null;
	}

	public Account[] findAccounts(String name) {
		return null;
	}

	public Account[] getAccounts() {
		return null;
	}

	public int getTotalAccount() {
		return 0;
	}
}

class Account {
	private String accountNo;
	private String name;
	private long balance;
	private Transaction[] transactions;

	public void deposit(long amount) {

	}

	public void withdraw() {

	}

	public long getBalance() {
		return 0;
	}

	public Transaction[] geTransactions() {
		return null;
	}
}

class Transaction {
	private String transactionDate;
	private String transactionTime;
}

public class ex_190905 {
	public static void main(String[] args) {

	}
}
