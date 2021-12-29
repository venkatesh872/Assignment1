package com.thoughtfocus.linkedHashSet;

import java.util.Iterator;
import java.util.LinkedHashSet;

import com.thoughtfocus.linkedHashSet.MobileDTO;


public class MobileDAO extends Mobile{
	LinkedHashSet<MobileDTO> mobileDTO = new LinkedHashSet<>();
	
@Override
public boolean add(MobileDTO dto) {
	if(dto!= null) {
		if(mobileDTO.add(dto)) {
			return true;
		}
	}
	return false;
}
@Override
public void getAll() {
	for(MobileDTO details:mobileDTO) {
		System.out.println(details);
	}
}
@Override
public MobileDTO deleteByMobileID(long mobileId) {
	Iterator<MobileDTO> itr=mobileDTO.iterator();
		while(itr.hasNext()) {
			MobileDTO mob=itr.next();
			if(mob.getMobileId()==mobileId) {
				mobileDTO.remove(mob);
			}
		}
	
		DeleteByMobileIdException deleteMobileIdException = new DeleteByMobileIdException();
		throw deleteMobileIdException;
	
	
}
@Override
public MobileDTO updateBySerialNumber(long oldSerialNumber, long newSerialNumber) {
	for(MobileDTO details:mobileDTO) {
		if(details.getSerialNumber()==oldSerialNumber) {
			details.setSerialNumber(newSerialNumber);
		}
			UpdateBySerialNumberException updateBySerialNumber = new UpdateBySerialNumberException();
			throw updateBySerialNumber;
	}
	return null;
}
@Override
public void getAllByBrandName(String brandName) {
	for(MobileDTO details:mobileDTO) {
		if(details.getBrandName().equals(brandName)) {
			System.out.println(details);
			
		}
	}
}
}