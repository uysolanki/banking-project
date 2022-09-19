package com.greatlearning.model;

public class Customer {

			private String cname;
			private long accno;
			private double balance;
			private String password;
			
			public Customer() {
				this.cname = "Rahul";
				this.accno = 12345;
				this.balance = 5000;
				this.password = "rahul123";
			}
			public Customer(String cname, long accno, double balance, String password) {
				super();
				this.cname = cname;
				this.accno = accno;
				this.balance = balance;
				this.password = password;
			}
			public String getCname() {
				return cname;
			}
			public void setCname(String cname) {
				this.cname = cname;
			}
			public long getAccno() {
				return accno;
			}
			public void setAccno(long accno) {
				this.accno = accno;
			}
			public double getBalance() {
				return balance;
			}
			public void setBalance(double balance) {
				this.balance = balance;
			}
			public String getPassword() {
				return password;
			}
			public void setPassword(String password) {
				this.password = password;
			}
			
			public boolean validatePassword(String pwd)
			{
				if(this.password.equals(pwd))
				{
					return true;
				}
				else
				{
					return false;
				}
			}
			
						
}
