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
	 sc.nextLine();
	 while(t-->0)
	 {
	     String str=sc.nextLine();
	     int count[]=new int[256];
	     int n=str.length();
	     String res="";
	     for(int i=0;i<n;i++)
	     {
	         int c=str.charAt(i);
	         if(count[c]==0)
	         {
	             res+=(char)c;
	             count[c]++;
	         }
	     }
	     System.out.println(res);
	 }
	 }
}