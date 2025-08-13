//5. Problem:
//Design a Movie class with fields (movieId, movieName, rating). Store 5 movie objects in an array. Implement the following:
//Accept all movie details.
//
//
//Display movies with rating greater than or equal to 4.0.
//
//
//Display the movie with the highest rating.
//
//
//Explanation:
//Trains how to traverse through array of objects, compare floating-point values, and retrieve specific information such as max rating.


package arr.obj;
import java.util.*;
class MoviesInfo
{
	private int movieId;
	private String movieName;
	private int rating;
	public int getMovieId() {
		return movieId;
	}
	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public void DisplayMovie()
	{
		
		System.out.printf("\nmovieId :%d , movieName  : %s , rating : %d ", getMovieId(), getMovieName(), getRating());
		System.out.println();
	}
	
}
public class Movie {
	 
	public void higestRating(MoviesInfo mi[])
	{
		for(int i=0;i<mi.length;i++)
		{
			for(int j=i+1;j<mi.length;j++)
			{
				if(mi[i].getRating() < mi[j].getRating())
				{
				  MoviesInfo temp=mi[i];
				  mi[i]=mi[j];
				  mi[j]=temp;
			    }
			}
		}
		System.out.println();
		System.out.println("Higest rating is :");
		for(int i=0;i<1;i++)
		{
			System.out.printf("\n movieId :%d , movieName  : %s , rating : %d ",mi[i].getMovieId(), mi[i].getMovieName(), mi[i].getRating());
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		MoviesInfo mi[]=new MoviesInfo[3];
		for(int i=0;i<mi.length;i++)
		{
			mi[i]=new MoviesInfo();
			
			System.out.println("Enter the movieId, movieName, rating");
			int mid=sc.nextInt();
			sc.nextLine();
			String mname=sc.nextLine();
			int mrating =sc.nextInt();
			
			mi[i].setMovieId(mid);
			mi[i].setMovieName(mname);
			mi[i].setRating(mrating);
		}
		
		System.out.println("The moives rating >= 4 :");
		for(int i=0;i<mi.length;i++)
		{
			if(mi[i].getRating() >= 4)
			{
				mi[i].DisplayMovie();
			}
		}
		
		Movie m=new Movie();
      	m.higestRating(mi);
		
		
		
	}
}
