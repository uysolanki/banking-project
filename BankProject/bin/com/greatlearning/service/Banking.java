package com.greatlearning.service;

import java.util.Scanner;

import com.greatlearning.model.Customer;

public class Banking {

		GenerateOTP otp=new GenerateOTP();
		
		
		public void deposit(Customer c2, int i)
		{
			
			String pwd;
			double newbal;
			Scanner sc=new Scanner(System.in);
			System.out.println("Pls enter Customer password");
			pwd=sc.next();  //virat127
			if(c2.validatePassword(pwd))
			{
				
				newbal=c2.getBalance()+i; //newbal 10999
				c2.setBalance(newbal);
			}
			else
			{
				System.out.println("Please enter Valid password");
			}
			
		}
		public void withdraw(Customer c1, double i)
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Pls enter Customer password");
			String pwd=sc.next(); //rahul123
			if(c1.validatePassword(pwd))
			{
				int sms=otp.getOTP();
				System.out.println("OTP is :"+sms);
				System.out.println("Enter the OTP");
				int o=sc.nextInt();
				if(o==sms)
				{
					if(c1.getBalance()-i >=0)
					{
						double newbal;
						newbal=c1.getBalance()-i;
						c1.setBalance(newbal);
					}
					else
					{
					System.out.println("Insufficient Funds");	
					}
				}
				else
				{
					System.out.println("Enter Valid OTP");
				}
			}
			else
			{
				
			}
			
		}
}
