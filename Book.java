//3. Problem:
//Create a Book class with fields (bookId, title, author, price). Store information of 6 books using an array of objects. Do the following:
//Accept all book details.
//
//
//Display books where the price is greater than ₹500.
//
//
//Count and display the number of such books.
//
//
//Explanation:
//Focuses on filtering data from an array of objects based on a condition. Practices object creation, input, filtering, and count logic.


package arr.obj;
import java.util.*;
class BDetail
{
	
	private int BookId;
	private String title;
	private String author;
	private int price;
	
	public int getBookIa() {
		return BookId;
	}
	public void setBookIa(int bookIa) {
		BookId = bookIa;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	 int count = 0;
	public void DisplayBook()
	{ 
	    System.out.printf(" \n BookId : %d  BookName : %s  bookauthor : %s  BookPrice : %d \n",getBookIa() , getTitle() ,getAuthor(), getPrice());
	}
	
	
}
public class Book {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		BDetail bd[]= new BDetail[3];
		
		for(int i=0;i<bd.length;i++)
		{
		    bd[i]=new BDetail();
			
			System.out.println("Enter the Bookid , BookTitle , BookAuthor , BookPrice");	
			int bi=sc.nextInt();
			sc.nextLine();
			String bt=sc.nextLine();
			String ba=sc.nextLine();
			int bp=sc.nextInt();
			
			bd[i].setBookIa(bi);
			bd[i].setTitle(bt);
			bd[i].setAuthor(ba);
			bd[i].setPrice(bp);
	
	    }
		int count=0;
		for(int i=0;i<bd.length;i++)
		{
			if(bd[i].getPrice() > 500)
			{
		     	bd[i].DisplayBook();
		     	count++;
		    }
	    }
		System.out.println("total count is "+count);
}
}
