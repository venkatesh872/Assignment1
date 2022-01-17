package com.thoughtfocus.jdbc.runner;

import com.thoughtfocus.jdbc.dao.StationaryShopDAO;
import com.thoughtfocus.jdbc.dto.StationaryShopDTO;

public class Runner {

	private static boolean add;

	public static void main(String[] args) {
		StationaryShopDTO stationaryshopdto = new StationaryShopDTO();
		stationaryshopdto.setBrandName("Classmate");
		stationaryshopdto.setName("Santhosh stationary shop");
		stationaryshopdto.setPrice(34567.80);
		stationaryshopdto.setQuantity(3);
		stationaryshopdto.setSerialNumber(101);
		stationaryshopdto.setType("Books and pens");
		
		StationaryShopDAO stationaryshopdao = new StationaryShopDAO();
		add = stationaryshopdao.add(stationaryshopdto);
		
	}

}
