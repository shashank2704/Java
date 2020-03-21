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
	     Hashtable<Character,Integer> hr=new Hashtable<Character,Integer>();
	     hr.put('I',1);
	     hr.put('X',10);
	     hr.put('C',100);
	     hr.put('M',1000);
	     hr.put('V',5);
	     hr.put('L',50);
	     hr.put('D',500);
	     int res=0;
	     for(int i=0;i<str.length();i++)
	     {
	         int s1=hr.get(str.charAt(i));
	         if(i+1<str.length())
	         {
	             int s2=hr.get(str.charAt(i+1));
	             if(s1>=s2)
	             {
	                 res=res+s1;
	             }
	             else
	             {
	                 res=res+s2-s1;
	                 i++;
	             }
	         }
	         else
	         {
	             res=res+s1;
	             i++;
	         }
	     }
	     System.out.println(res);
	 }
	 
	 }
}