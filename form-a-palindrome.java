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
	            char[] str=sc.next().toCharArray();
	            int n=str.length;
	            int[][] arr=new int[n][n];
	            for(int i=1;i<n;i++)
	            {
	                for(int l=0,h=i;h<n;l++,h++)
	                {
	                    arr[l][h]=(str[l]==str[h])?arr[l+1][h-1]:
	                    Math.min(arr[l+1][h],arr[l][h-1])+1;
	                
	                }
	            }
	            System.out.println(arr[0][n-1]);
	            
	        }
	 }
}