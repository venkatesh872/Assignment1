package com.thoughtfocus.bank.dto;

public class AccountHolderDTO {
	private String name;
	private long accountNumber;
	private String iFSC;
	private long contactNumber;
	private String email;
	private float balance;
	private AddressDTO address;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getiFSC() {
		return iFSC;
	}
	public void setiFSC(String iFSC) {
		this.iFSC = iFSC;
	}
	public long getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(long contactNumber) {
		this.contactNumber = contactNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "AccountHolderDTO [name=" + name + ", accountNumber=" + accountNumber + ", iFSC=" + iFSC
				+ ", contactNumber=" + contactNumber + ", email=" + email + "]";
	}
	public float getBalance() {
		return balance;
	}
	public void setBalance(float balance) {
		this.balance = balance;
	}
	public AddressDTO getAddress() {
		return address;
	}
	public void setAddress(AddressDTO address) {
		this.address = address;
	}
	
}
