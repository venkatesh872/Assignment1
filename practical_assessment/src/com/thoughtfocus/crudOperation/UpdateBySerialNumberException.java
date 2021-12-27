package com.thoughtfocus.crudOperation;

public class UpdateBySerialNumberException extends RuntimeException{


	@Override
	public String getMessage() {
		return "Serial Number is invalid.....";
	}


}