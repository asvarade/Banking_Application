package com.test.controller;

public class WrongIdorPassException extends Exception {

	String massage;
	
	public WrongIdorPassException(String massage) {
		super(massage);
	}
}
