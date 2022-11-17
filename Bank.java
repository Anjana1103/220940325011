import java.util.Scanner;

class BankAccount{
	int accno;
	double balance;
	
	BankAccount(int accno, double balance){
		this.accno=accno;
		this.balance=balance;
	}
	
	void withdraw(int amount){
		
			balance=balance-amount;
			System.out.println("Transaction completed");
			System.out.println("The current Amount in the Account is :"+balance);
		
	}
	
	int deposit(int amount){
		balance=balance+amount;
		System.out.println("Transaction completed");
		System.out.println("The current Amount in the Account is :"+balance);
		return amount;
	}
	
	void display(){
		System.out.println("The Account Number is : "+accno);
		System.out.println("The Balance in the account is :"+balance);
	}
}

class Bank{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		BankAccount ba=new BankAccount(11,30000);
		
		System.out.print("Enter the Amount :");
		int amount=sc.nextInt();
		
		try{
			
			if(ba.balance<amount){
				
				throw new InsuffientBalanceException("Insufficient Balance for withdrawal!");
			}
			else{
				ba.withdraw(amount);
			}
		}
		catch(InsuffientBalanceException e){
			System.out.println("Exception is thrown!");
			System.out.println(e.getMessage());
		}
		
	}
}

class InsuffientBalanceException extends Exception{
	InsuffientBalanceException(String str){
		super(str);
	}
}