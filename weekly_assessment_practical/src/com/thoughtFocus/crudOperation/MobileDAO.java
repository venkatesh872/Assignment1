package com.thoughtFocus.crudOperation;

public class MobileDAO implements MobileMethods{
	MobileDTO[] details=new MobileDTO[3];
	int index=0;

	boolean add(MobileDTO dto) {
		if(dto!=null) {
			details[index]=dto;
			index++;
		}
		return false;
	}

	@Override
	public void getAll() {
		for(int index=0;index<details.length;index++) {
			if(details[index]!=null) {
				System.out.println(details[index]);
			}
		}

	}

	@Override
	public void getAllByBrandName(String brandName) {	 
			for(int index=0;index<details.length;index++) {
				if(details[index]!=null) {
				if(brandName.equals(details[index].getBrandName())) {
					System.out.println(details[index]);
				}
				else {
					CustomException mobileException=new CustomException();
							throw mobileException;
				}
			}
			}		
	}
	MobileDTO deleteByMobileID( int mobileID) {
		MobileDTO mobDto=null;
		for(int index=0;index<details.length;index++) {
			if(details[index]!=null) {
			if(mobileID==details[index].getMobileID()) {
				details[index]=null;
				mobDto=null;
				return mobDto;
			}
		}
	}
		return mobDto;
	}

	MobileDTO updateBySerialNumber ( int serialNumber,String mobileName ) {
		for(int index=0;index<details.length;index++) {
			if(serialNumber==details[index].getSerialNumber()) {
				details[index].setBrandName(mobileName);
			}
		}
		return null;
	}

	}

