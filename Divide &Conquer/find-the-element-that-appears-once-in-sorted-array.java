import java.io.*;
import java.util.*;
class GFG
 {
	public static void main (String[] args)
	 {
	     Scanner sc=new Scanner(System.in);
	     int t=sc.nextInt();
	     while(t-->0)
	     {
	         int n=sc.nextInt();
	         int[] arr=new int[n];
	         for(int i=0;i<n;i++)
	         {
	             arr[i]=sc.nextInt();
	         }
	         int res=0;
	         for(int i=0;i<arr.length;i++)
	         {
	             res=res^arr[i];
	         }
	         System.out.println(res);
	         
	     }
	     
	 }
}