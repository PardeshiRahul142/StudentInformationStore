//1. Create a Student class with fields rollNo, name, and marks. Create 3 student objects and set values using setter methods. Write logic to:
//Display the student with the highest marks.
//
//
//📝 Explanation:
// Use simple if conditions to compare marks between 3 students. Use getters to retrieve values.
package arr.obj;
import java.util.*;
class StuInfo
{
	private int rollNo;
	private String name;
	private int marks;
	
	public void setRollNo(int r)
	{
		this.rollNo=r;
	}
	public int getRollNo()
	{
		return rollNo;
	}
	public void setName(String n)
	{
		this.name=n;
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
}
public class Student {

	public static void main(String[] args) {
		StuInfo s[]=new StuInfo[5];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<s.length;i++)
		{
			System.out.println("Enter the roll , name, marks ");
			int r=sc.nextInt();
			sc.nextLine();
			String n=sc.nextLine();
			int m=sc.nextInt();
			
			s[i]=new StuInfo();
			s[i].setRollNo(r);
			s[i].setName(n);
			s[i].setMarks(m);
		}
		for(int i=0;i<s.length;i++)
		{
			System.out.println(" "+s[i].getRollNo()+"\t"+s[i].getName()+"\t"+s[i].getMarks()+" ");
		}
		
	}

}
