package com.thoughtfocus.linkedHashSet;

public class UpdateBySerialNumberException extends RuntimeException{
@Override
public String getMessage() {
	return "Serial number is not valid.";
}
}
