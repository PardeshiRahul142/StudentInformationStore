//Q1. Write a java program to create pojo class name as Product with a following properties like 
//as pid, pname, quantity and rate. create the another class name as Bill
//and this class is depend on product but we want to pass more than one 
//product details to Bill class so here we use the var-args concept.
//		- Calculate bill without Gst.
//- Calculate bill with 18% Gst.


package arr.obj;
import java.util.*;
class ProdDet
{
	private int pid;
	private String pname;
	private int quantity;
	private double rate;
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getRate() {
		return rate;
	}
	public void setRate(double rate) {
		this.rate = rate;
	}
	
}
class Bill
{
	public void gstBill(ProdDet pd[])
	{
	    for(int i=0;i<pd.length;i++)
	    {
	    	   double gst=pd[i].getRate()*0.18;
	    	   double finalBill=gst + pd[i].getRate();
	    	   System.out.println("The gst bill is :"+finalBill);
	    	   System.out.println("The without gst bill is :"+pd[i].getRate());
	    }
	}

	
}
public class Product{

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ProdDet pd[]=new ProdDet[1];
		
		for(int i=0;i<pd.length;i++)
		{
			pd[i]=new ProdDet();
			
			System.out.println("pid, pname, quantity and rate");
			int pid=sc.nextInt();
			sc.nextLine();
			String pname=sc.nextLine();
			int qty=sc.nextInt();
			double rate=sc.nextDouble();
			
			pd[i].setPid(pid);
			pd[i].setPname(pname);
			pd[i].setQuantity(qty);
			pd[i].setRate(rate);
		}
		Bill b=new Bill();
		b.gstBill(pd);
		

	}

}
