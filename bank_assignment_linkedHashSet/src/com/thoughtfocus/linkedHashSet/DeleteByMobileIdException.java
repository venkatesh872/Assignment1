package com.thoughtfocus.linkedHashSet;

public class DeleteByMobileIdException extends RuntimeException{
	@Override
	public String getMessage() {
		return "mobile id is not valid";
	}
}
