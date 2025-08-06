package arr.obj;
import java.util.*;
class StudDetails
{
	private int rollNo;
	private String name;
	private int marks;
	private String address;
	private int fee;
	
	public void setRollNo(int r)
	{
		this.rollNo=r;
	}
	public int getRollNo()
	{
		return rollNo;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	public void setMarks(int m)
	{
		this.marks=m;
	}
	public int getMarks()
	{
		return marks;
	}
	public void setAddress(String add)
	{
		this.address=add;
	}
	public String getAddress()
	{
		return address;
	}
	public void setFee(int f)
	{
		this.fee=f;
	}
	public int getFee()
	{
		return fee;
	}
}
public class StudentArrObjApp {

	public static void main(String[] args) {
		
		StudDetails st[]=new StudDetails[2];
		Scanner sc=new Scanner(System.in);
		
		for(int i=0;i<st.length;i++)
		{
			st[i]=new StudDetails();
			
			System.out.println("Enter the:\tRollNo\tname\tmarks\taddress\tfee");
			int r=sc.nextInt();
			sc.nextLine();
			String n=sc.nextLine();
			int m=sc.nextInt();
			sc.nextLine();
			String add=sc.nextLine();
			int f=sc.nextInt();
			
			st[i].setRollNo(r);
			st[i].setName(n);
			st[i].setMarks(m);
			st[i].setAddress(add);
			st[i].setFee(f);
			
		}
		System.out.println("Show the student detail information :");
		for(int i=0;i<st.length;i++)
		{
		  System.out.println(st[i].getRollNo() + "\t"+st[i].getName()+"\t"+st[i].getMarks()+"\t"+st[i].getAddress()+"\t"+st[i].getFee());
		}

	}

}
