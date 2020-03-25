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
    	     String str=sc.next();
    	     boolean m1=true;
    	     int[] arr=new int[26];
    	     int n=str.length();
    	     for(int i=0;i<n;i++)
    	     {
    	         char c=str.charAt(i);
    	         arr[c-'a']++;
    	         
    	     }
    	     int max=n/2+1;
    	     if(n%2==0)
    	     {
    	         max=n/2;
    	         
    	     }
    	     for(int i=0;i<26;i++)
    	     {
    	         if(arr[i]>max)
    	         {
    	             m1=false;
    	             break;
    	         }
    	     }
    	     if(m1)
    	     {
    	         System.out.println(1);
    	     }
    	     else
    	     {
    	         System.out.println(0);
    	     }
    	 }
	}
}