import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		
	    Scanner sc=new Scanner(System.in);
	    int t=sc.nextInt();
	    while(t-->0)
	    {
	        String s=sc.next();
	        String[] arr=s.split("\\.");
	        int m=arr.length;
	        for(int i=m-1;i>=0;i--)
	        {
	            if(i==0)
	            {
	                System.out.print(arr[i]);
	            }
	            else
	            {
	                System.out.print(arr[i]+".");
	            }
	        }
	        System.out.println();
	    
	    }
    }
}