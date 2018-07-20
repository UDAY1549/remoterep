package com.nt.dev;

public class AccountType {

	String SavingAccount;
	String CurrentAccount;

	
	// create setter and getter methods
	public String getSavingAccount() {
		return SavingAccount;
	}

	public void setSavingAccount(String savingAccount) {
		SavingAccount = savingAccount;
	}

	public String getCurrentAccount() {
		return CurrentAccount;
	}

	public void setCurrentAccount(String currentAccount) {
		CurrentAccount = currentAccount;
	}

	//generate to String method
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

}
