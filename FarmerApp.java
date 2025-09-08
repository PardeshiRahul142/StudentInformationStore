package arr.obj;
import java.util.*;
class Farm
{
	private int fid;
	private String fname;
	private float farea;
	private int production;
	
	
	public void setFid(int fid)
	{
		this.fid=fid;
	}
	public int getFid()
	{
		return  fid;
	}
	public void setName(String name)
	{
		this.fname=fname;
	}
	public String getFname()
	{
		return fname;
	}
	public void setFarea(float farea)
	{
		this.farea=farea;
	}
	public float getFarea()
	{
		return farea; 
	}
	public void setProducation(int prod)
	{
		this.production=prod;
	}
	public int getProduction()
	{
		return production;
	}
	
}
class AllFamers
{
	private Farm f;
	public void DisplayFarmer(Farm f[])
	{
		for(int i=0;i<f.length;i++)
		{
			System.out.println("Fid :"+f[i].getFid()+" "+
		                        "Fname :"+f[i].getFname()+" "+
					             "Farea :"+f[i].getFarea()+" "+
		                          "Production :"+f[i].getProduction());
		}
	}
}
public class FarmerApp {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Farm f[]=new Farm[2];
		for(int i=0;i<f.length;i++)
		{
			f[i]=new Farm();
			System.out.println("Enter the fid , fname ,farea , production");
			int id=sc.nextInt();
			sc.next();
			String name=sc.nextLine();
			float area=sc.nextFloat();
			int prod=sc.nextInt();
			
			f[i].setFid(id);
			f[i].setName(name);
			f[i].setFarea(area);
			f[i].setProducation(prod);
		}
		AllFamers af=new AllFamers();
		af.DisplayFarmer(f);
		
	}

}
