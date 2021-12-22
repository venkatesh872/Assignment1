package com.thoughtfocus.bankAccountDetails;



	public class CreateAccount extends BankAccountDetails{
		public CreateAccount(int savingAmount,int depositAmount,int withdrawAmount,int fixedAmount) {
			this.saving(savingAmount);
			this.deposit(depositAmount);
			this.withdraw(withdrawAmount);
			this.fixed(fixedAmount);
			
		}
}
