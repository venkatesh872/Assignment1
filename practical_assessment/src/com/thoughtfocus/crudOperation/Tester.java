package com.thoughtfocus.crudOperation;

public class Tester {
	public static void main(String[] args) {
		MobileDAO dao = new MobileDAO();

		MobileDTO dto = new MobileDTO();
		MobileDTO dto1 = new MobileDTO();

		dto.setMobileId(90876543);
		dto.setBrandName("RealMe");
		dto.setMemory(64);
		dto.setModelName("3pro");
		dto.setNoOfCamera((byte) 2);
		dto.setPrice(15000);
		dto.setSerialNumber(987654321l);

		dto1.setMobileId(123458789l);
		dto1.setBrandName("Nokia");
		dto1.setMemory(32);
		dto1.setModelName("345");
		dto1.setNoOfCamera((byte) 1);
		dto1.setPrice(10000);
		dto1.setSerialNumber(630952005);

		dao.add(dto); 
		dao.add(dto1);

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