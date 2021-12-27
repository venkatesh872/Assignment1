package com.thoughtfocus.crudOperation;

public class DeleteMobileIdException extends RuntimeException {

	@Override
	public String getMessage() {
		return " It is Unable to delete!!";
	}
}