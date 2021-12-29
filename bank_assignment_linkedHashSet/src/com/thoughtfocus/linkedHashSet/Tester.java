package com.thoughtfocus.linkedHashSet;


public class Tester {
	public static void main(String[] args) {
		MobileDAO dao = new MobileDAO();

		MobileDTO dto1 = new MobileDTO();
		
		dto1.setMobileId(1234568);
		dto1.setBrandName("RealMe");
		dto1.setMemory(64);
		dto1.setModelName("3pro");
		dto1.setNoOfCamera((byte) 2);
		dto1.setPrice(15000);
		dto1.setSerialNumber(987654321l);
		
		
		MobileDTO dto2 = new MobileDTO();
		
		dto2.setMobileId(8654321);
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
		
		dao.getAllByBrandName("Nokia"); 

		System.out.println("*******************************************************");

		try {
			MobileDTO deleted = dao.deleteByMobileID(1234564);
			System.out.println(deleted);
		} catch (DeleteByMobileIdException e) {
			System.out.println(e.getMessage());
		}

		System.out.println("***************************************************");

		try {
			MobileDTO updated = dao.updateBySerialNumber(630952005, 905216962);
			System.out.println(updated);
		} catch (UpdateBySerialNumberException e) {
			System.out.println(e.getMessage());
		}
		
	}
}
