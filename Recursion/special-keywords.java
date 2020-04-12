import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
     static int getSp(int n)
     {
         if(n==1 || n==3 || n==2)
         {
             return n;
             
         }
         if(n==0)
         {
             return 0;
         }
         
         int[] ap=new int[n+1];
         ap[0]=0;
         ap[1]=1;
         
         for(int i=2;i<n+1;i++)
         {
             int max=i+1;
             for(int k=2;k<i-2;k++)
             {
                 if(ap[k]*(i-k-1)>max)
                 {
                     max=ap[k]*(i-k-1);
                 }
                 
             }
             ap[i]=max;
         }
         return ap[n-1];
     }
	public static void main (String[] args)
	 {
	 //code
	    Scanner sc=new Scanner(System.in);
	    int t=sc.nextInt();
	    while(t-->0)
	    {
	        int n=sc.nextInt();
	        int p=getSp(n);
	        System.out.println(p);
	    }
	 }
}