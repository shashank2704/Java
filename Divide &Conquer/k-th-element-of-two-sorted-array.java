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
	          int m=sc.nextInt();
	          int n=sc.nextInt();
	          int k=sc.nextInt();
	          int arr[]=new int[n+m];
	          for(int i=0;i<n+m;i++)
	          {
	              arr[i]=sc.nextInt();
	          }
	          Arrays.sort(arr);
	          System.out.println(arr[k-1]);
	      }
	 
	 
	 }
}