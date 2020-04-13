import java.lang.*;
import java.util.*;

class GFG {

	public static void main (String[] args) {
		//code
		
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
		    int n=sc.nextInt(),c=-1;
		    
		    int[] arr=new int[n];
		    
		    for(int i=0;i<n;i++)
		    {
		        arr[i]=sc.nextInt();
		    }
		    int k=sc.nextInt();
		    for(int i=0;i<n;i++)
		    {
		        if(arr[i]==k)
		        {
		            c=i;
		        }
		    }
		    System.out.println(c);
		}
	}
}