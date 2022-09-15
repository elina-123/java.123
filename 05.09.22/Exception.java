package com.java;

public class InvalidSalaryException extends Exception {

	private static final long serialVersionUID = 1L;

	InvalidSalaryException(String msg){
		super(msg);
	}
