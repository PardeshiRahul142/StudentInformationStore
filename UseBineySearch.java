package Arr.gth;

public class UseBineySearch {

	public static void main(String[] args) {
		int a[]= {10,20,30,40,50,60};
		int index=-1;
		int skey=10;
		int left=0 ;
		int right=(a.length-1);
		
		while(left<=right)
		{
			int mid=left+(right-left)/2;
			if(a[mid]==skey)
			{
				System.out.println(a[mid]);
				index=a[mid];
				break;
			}
			if(a[mid]<skey)
			{
				left=mid+1;
			}
			else
			{
				right=mid-1;
			}
		}
		if(index != -1)
		{
			System.out.println("found element :");
		}
		else
		{
			System.out.println("not found element :");
		}

	}

}
