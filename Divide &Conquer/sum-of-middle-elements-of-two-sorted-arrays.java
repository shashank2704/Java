import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
	public static void main (String[] args)
	 {
	 //code
	        Scanner sc=new Scanner(System.in);
	        int t=sc.nextInt();
	        while(t-->0)
	        {
	            int n=sc.nextInt();
	            int[] a=new int[n];
	            int[] b=new int[n];
	            for(int i=0;i<a.length;i++)
	            {
	                a[i]=sc.nextInt();
	            }
	            for(int i=0;i<b.length;i++)
	            {
	                b[i]=sc.nextInt();
	            }
	            
	            int count=0;
	            int i=0;
	            int j=0;
	            int sum=0;
	            int prev=0;
	            while(i<n && j<n)
	            {
	                if(count==n)
	                {
	                    sum+=prev;
	                }
	                if(count==n+1)
	                {
	                    sum+=prev;
	                    break;
	                }
	                if(a[i]<b[j])
	                {
	                    prev=a[i];
	                    count++;
	                    i++;
	                }
	                else
	                {
	                    prev=b[j];
	                    count++;
	                    j++;
	                }
	              
	            }
	              System.out.println(sum);
	        }
	 }
}