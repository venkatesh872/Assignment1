package com.thoughtfocus.linkedHashSet;

public abstract class Mobile {
	abstract public boolean add(MobileDTO dto);

	abstract public void getAll();

	abstract public MobileDTO deleteByMobileID(long mobileId);

	abstract public MobileDTO updateBySerialNumber(long oldSeriallNumber, long newSerialNumber);
	
	abstract public void getAllByBrandName(String brandName);
}
