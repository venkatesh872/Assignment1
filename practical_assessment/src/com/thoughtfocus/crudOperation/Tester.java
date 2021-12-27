package com.thoughtfocus.crudOperation;

public class Tester {
	public static void main(String[] args) {
		MobileDAO dao = new MobileDAO();

		MobileDTO dto1 = new MobileDTO();
		MobileDTO dto2 = new MobileDTO();

		dto1.setMobileId(90876543);
		dto1.setBrandName("RealMe");
		dto1.setMemory(64);
		dto1.setModelName("3pro");
		dto1.setNoOfCamera((byte) 2);
		dto1.setPrice(15000);
		dto1.setSerialNumber(987654321l);

		dto2.setMobileId(123458789l);
		dto2.setBrandName("Nokia");
		dto2.setMemory(32);
		dto2.setModelName("345");
		dto2.setNoOfCamera((byte) 1);
		dto2.setPrice(10000);
		dto2.setSerialNumber(630952005);

		dao.add(dto1); 
		dao.add(dto2);

		dao.getAll();

		System.out.println("****************************************************");

		dao.getAllByBrandName("RealMe"); 

		System.out.println("*******************************************************");

		try {
			MobileDTO deleteStatus = dao.deleteByMobileID(123458789l);
			System.out.println(deleteStatus);
		} catch (DeleteMobileIdException e) {
			System.out.println(e.getMessage());
		}

		System.out.println("***************************************************");

		try {
			MobileDTO updatStatus = dao.updateBySerialNumber(630952005, 905216962); 
			System.out.println(updatStatus);
		} catch (UpdateBySerialNumberException e) {
			System.out.println(e.getMessage());
		}
	}
}