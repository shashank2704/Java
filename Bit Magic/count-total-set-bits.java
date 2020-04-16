import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
	public static void main (String[] args)
	 {
	 //code
	        Scanner sc=new Scanner(System.in);
	        int x,n,t;
	        t=sc.nextInt();
	        long ans=0;
	        while(t-->0)
	        {
	            n=sc.nextInt();
	            ans=0;
	            for(int i=1;i<=n;i++)
	            {
	                x=i;
	                while(x>0)
	                {
	                    x=x&(x-1);
	                    ans++;
	                }
	            }
	            System.out.println(ans);
	        }
	    
	 
	 }
}