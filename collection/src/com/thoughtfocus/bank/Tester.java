package com.thoughtfocus.bank;

import com.thoughtfocus.bank.dao.AccountHolderDAO;
import com.thoughtfocus.bank.dto.AccountHolderDTO;
import com.thoughtfocus.bank.dto.AddressDTO;

public class Tester {
	public static void main(String[] args) {
		AccountHolderDAO dao = new AccountHolderDAO();
		AccountHolderDTO dto = new AccountHolderDTO();
		AddressDTO address = new AddressDTO();
		
		dto.setAccountNumber(233488990);
		dto.setName("Venky");
		dto.setContactNumber(630952005);
		dto.setEmail("venky@thoughtfocus.com");
		dto.setiFSC("324563LK");
		dto.setBalance(2500);
		
		address.setBuilding("7-273");
		address.setArea("Venkateswara nagar");
		address.setLandmark("Chimakurthy");
		address.setCity("Chimakurthy");
		address.setState("AndhraPradesh");
		address.setCountry("India");
		address.setPincode(523226);
		
		dto.setAddress(address);
		String save = dao.save(dto);
		System.out.println("******************************************************");
	
		AccountHolderDTO dto2 = new AccountHolderDTO();
		AddressDTO address2 = new AddressDTO();

		dto2.setAccountNumber(678347862);
		dto2.setName("Venkatesh");
		dto2.setiFSC("CMK145");
		dto2.setContactNumber(891928461);
		dto2.setBalance(6000);
		dto2.setEmail("venkat@tf.com");

		address2.setBuilding("7-365");
		address2.setArea("ongole");
		address2.setLandmark("rangareddy cheruvu");
		address2.setCity("Ongole");
		address2.setState("AP");
		address2.setCountry("India");
		address2.setPincode(523001);

		dto2.setAddress(address2);

		String save1 = dao.save(dto2);
		System.out.println(save1);
		System.out.println("**********************************************************");

		AccountHolderDTO getByName = dao.getByName("Venky"); 
		System.out.println(getByName);
		System.out.println("*******************************************************");

		String delete = dao.deleteByAccountNumber(905216962); 
		System.out.println(delete);
		System.out.println("*******************************************************");

		String update = dao.updateByContact(891928461, 905216962); 
		System.out.println(update);
		System.out.println("*******************************************************");
		
		AccountHolderDTO updatePincode = dao.updatePincodeByArea("Venkateswara nagar", 523002);
		System.out.println(updatePincode);

		System.out.println("*******************************************************");

		float balance = dao.getCurrentBalance(678347862); 
		System.out.println(balance);
		System.out.println("*****************************************************");

		float depositStatus = dao.deposit(5000, 678347862);
		System.out.println(depositStatus);
		System.out.println("*****************************************************");

		float debitedAmount = dao.withdraw(1000, 678347862);
		System.out.println(debitedAmount);
		System.out.println("*****************************************************");

		dao.printAll();
	
	}
}

