//Q.1. Bank Account Transactions
//Create an Account class with: accNo, name, balance.
//Task:
//
//Create array of 5 accounts.
//
//Perform deposit and  withdraw operations.
//
//Display accounts with balance < 1000 (low balance warning).
//
//Sort accounts in descending order of balance.

package arr.obj;
import java.util.*;
class Stud
{
	private int accNo;
	private String name;
	private int balance;
//	private int afterDep;
//	private int afterWithdrow;
	
	
	public void setAccNo(int accNo)
	{
		this.accNo=accNo;
	}
	public int getAccNo()
	{
		return accNo;
	}
	public void setName(String n)
	{
		this.name=n;
	}
	public String getName()
	{
		return name;
	}
	public void setBalance(int bal)
	{
		this.balance=bal;
	}
	public int getBalance()
	{
		return balance;
	}
	
	
	
}
class SortAcc
{
	  void SortBankAccount(Stud s[])
	  {
		  for(int i=0 ; i<s.length; i++)
		  {
		    System.out.println(s[i].getAccNo() +" \t " +s[i].getName() +"\t"+s[i].getBalance());
		  }
	  }
}
public class BankTransaction {

	public static void main(String[] args) {
		
      
      SortAcc st=new SortAcc();
      Stud s[]=new Stud[5];
      
      Scanner sc=new Scanner(System.in);
      
      for(int i=0;i<s.length;i++)
      {
      	  s[i]=new Stud();
      	  System.out.println("Enter the  1) accNo , 2)name , 3)balance ");
      	  int id=sc.nextInt();
      	  sc.nextLine();
      	  String name=sc.nextLine();
      	  int balance=sc.nextInt();
      	  
      	  s[i].setAccNo(id);
      	  s[i].setName(name);
      	  s[i].setBalance(balance);
      }
      st.SortBankAccount(s);
     
      
	}

}
