package customerDetails;

public class CustomerDetails {
	String fullName;
	String phoneNumber;
	String emailId;
	String address;
	int purchaseAmount;
	int cashbackAmount;
	
	public void customerName(String fullName) {
		System.out.println("Customer name is : "+fullName);
	}
	public void customerPhoneNumber(String phoneNumber) {
		System.out.println("Customer phone number is : "+ phoneNumber);
	}
	public void customerEmailId(String emailId) {
		System.out.println("Customer email id is : "+emailId);
	}
	public void customerAddress(String address) {
		System.out.println("Customer address is : "+address);
	}
	public void customerPurchaseAmount(int purchaseAmount) {
		System.out.println("Customer purchase amount is : "+purchaseAmount);
	}
	public void customerCashbackAmount(int cashbackAmount) {
		System.out.println("Customer cashbackAmount is : "+cashbackAmount);
	}
	CustomerDetails(String fullName,String phoneNumber,String emailId,String address){
		this.customerName(fullName);
		this.customerPhoneNumber(phoneNumber);
		this.customerEmailId(emailId);
		this.customerAddress(address);
	}
	CustomerDetails(int purchaseAmount, int cashbackAmount){
		this.customerPurchaseAmount(purchaseAmount);
		this.customerCashbackAmount(cashbackAmount);
	}
	
	

}
