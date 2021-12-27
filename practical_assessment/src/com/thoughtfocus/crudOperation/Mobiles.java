package com.thoughtfocus.crudOperation;

public abstract class Mobiles {
	abstract public boolean add(MobileDTO dto);

	abstract public void getAll();

	abstract public MobileDTO deleteByMobileID(long mobileId);

	abstract public MobileDTO updateBySerialNumber(long oldSerailNumber, long newSerailNumber);
	abstract public void getAllByBrandName(String brandName);
}
