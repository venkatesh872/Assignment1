package com.thoughtfocus.bank.dao;

import java.util.ArrayList;

import java.util.Iterator;
import java.util.List;

import com.thoughtfocus.bank.dto.AccountHolderDTO;

public class AccountHolderDAO {
	private List<AccountHolderDTO> dtos = new ArrayList<AccountHolderDTO>();
	
	public String save(AccountHolderDTO dto) {
		boolean isSaved =dtos.add(dto);
		if (isSaved) {
			return "Data saved";
		}else {
			return "Data not saved";
		}
	}
	public AccountHolderDTO getByName(String name) {
		for (int index = 0;index <dtos.size();index++) {
			if (dtos.get(index).getName().equals(name)) {
			return  dtos.get(index);
	
			}
		}
		return null;
	}
	public String deleteByAccountNumber(long accountNumber) {
		for (int index = 0;index <dtos.size();index++) {
			if (dtos.get(index).getAccountNumber()==accountNumber) {
				 dtos.remove(index);
				 return "account is deleted";
			}
		}
		return "not deleted";
	}
	public String updateByContact(long oldContactNumber,long newContactNumber) {
		for (int index = 0;index <dtos.size();index++) {
			if (dtos.get(index).getContactNumber()==oldContactNumber) {
				 dtos.get(index).setContactNumber(newContactNumber);
				 return "contact number is updated.";
			}
		}
		return "not updated";
	}
	public AccountHolderDTO updatePincodeByArea(String area, int pincode) {
		for (int index = 0; index < dtos.size(); index++) {
			if (dtos.get(index).getAddress().getArea().equals(area)) {
				dtos.get(index).getAddress().setPincode(pincode);
				return dtos.get(index);
			}
		}
		return null ;
	}

	public float getCurrentBalance(long accountNumber) {
		for (int index = 0; index < dtos.size(); index++) {
			if (dtos.get(index).getAccountNumber() == accountNumber) {
				return dtos.get(index).getBalance();

			}
		}
		return accountNumber ;
	}

	public float deposit(float amount, long accountNumber) {
		for (int index = 0; index < dtos.size(); index++) {
			if (dtos.get(index).getAccountNumber() == accountNumber) {
				float previousBalance = dtos.get(index).getBalance();
				float newBalance = previousBalance + amount;
				dtos.get(index).setBalance(newBalance);
				return newBalance;
			}
		}
		return 0.00f;
	}

	public float withdraw(float amount, long accountNumber) {
		for (int index = 0; index < dtos.size(); index++) {
			if (dtos.get(index).getAccountNumber() == accountNumber) {
				if (dtos.get(index).getBalance() > amount) {
					float currentBalance = dtos.get(index).getBalance() - amount;
					dtos.get(index).setBalance(currentBalance);
					return currentBalance;
				}
			}
		}
		return 0.00f;
	}
	public void printAll() {
		for (int index = 0; index < dtos.size(); index++) {
				if (dtos.get(index).getAccountNumber() != 0) {
					System.out.println(dtos.get(index));
				}
		}
	
		
	}

}
