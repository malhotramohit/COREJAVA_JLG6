
// POJO Bean Model
// plain old java object
public class Account {

	private long accountNumber;
	String accountHolderName;

	//
	Account(long accNo, String accName) {
		accountNumber = accNo;
		accountHolderName = accName;
	}
	
	long getAccountNumber() {
		return accountNumber;
	}

}
