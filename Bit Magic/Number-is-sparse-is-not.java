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
    	     if((n& n>>1)>0)
    	     {
    	         System.out.println("0");
    	     }
    	     else
    	     {
    	         System.out.println("1");
    	     }
    	 }
	 
	 }
}