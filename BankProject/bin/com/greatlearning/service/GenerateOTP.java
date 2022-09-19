package com.greatlearning.service;

public class GenerateOTP {
	
	public int getOTP()
	{
	return	(int)(Math.random() *9000)+1000;
	}

}
