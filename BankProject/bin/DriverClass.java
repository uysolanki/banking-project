import java.util.Scanner;

import com.greatlearning.model.Customer;
import com.greatlearning.service.Banking;

public class DriverClass {

	public static void main(String args[])
	{
		Customer c1=new Customer();
		Banking b1=new Banking();
		
		//System.out.println(c1.getCname());
		
		Customer c2=new Customer("Virat",654321,10000,"virat123");
		//System.out.println(c2.getCname());
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("balance before Deposit :"+c2.getBalance()); //10000
		b1.deposit(c2,999);
		System.out.println("balance after Deposit:"+c2.getBalance());
		System.out.println(c1.getCname() + "balance Before Withdrawl:"+c1.getBalance());
		b1.withdraw(c1,500);
		System.out.println(c1.getCname() + "balance after Withdrawl:"+c1.getBalance());
	}
}
