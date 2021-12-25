package com.thoughtFocus.crudOperation;

public class Tester {
	public static void main(String[] args) {
		MobileDAO dao=new MobileDAO();
		MobileDTO mobileDto = new MobileDTO();
		mobileDto.setBrandName("Apple");
		mobileDto.setModelName("XR");
		mobileDto.setMemory("62GB");
		mobileDto.setMobileID(1234);
		mobileDto.setNoOfCamera(2);
		mobileDto.setSerialNumber(56789);
		mobileDto.setPrice(46000);

		MobileDTO mobileDto1 = new MobileDTO();
		mobileDto1.setBrandName("MOTOROLA");
		mobileDto1.setModelName("G30");
		mobileDto1.setMemory("32GB");
		mobileDto1.setMobileID(4563);
		mobileDto1.setNoOfCamera(2);
		mobileDto1.setSerialNumber(5678);
		mobileDto1.setPrice(24000);

		MobileDTO mobileDto2 = new MobileDTO();
		mobileDto2.setBrandName("RealMe");
		mobileDto2.setModelName("3PRo");
		mobileDto2.setMemory("64GB");
		mobileDto2.setMobileID(4564);
		mobileDto2.setNoOfCamera(3);
		mobileDto2.setSerialNumber(1234567);
		mobileDto2.setPrice(14000);

		dao.add(mobileDto);
		dao.add(mobileDto1);
		dao.add(mobileDto2);

		dao.getAll();
		System.out.println("==============================================================================================================================");
		try {
		dao.getAllByBrandName("Motorola");
		}catch(CustomException e) {
			e.exceptionMessage();
		}
		System.out.println("==============================================================================================================================");


		dao.updateBySerialNumber(5678,"Motorola");
		dao.getAll();
		System.out.println("==============================================================================================================================");


		dao.deleteByMobileID(4564);
		dao.getAll();



	}

}
