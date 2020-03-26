import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
     public static String common(String s1,String s2)
     {
         boolean flag1[]=new boolean[26];
         boolean flag2[]=new boolean[26];
         for(int i=0;i<s1.length();i++)
         {
             flag1[s1.charAt(i)-97]=true;
         }
         for(int i=0;i<s2.length();i++)
         {
             flag2[s2.charAt(i)-97]=true;
         }
         String s="";
         for(int i=0;i<s1.length();i++)
         {
             char ch=s1.charAt(i);
             if(flag1[ch-97]&&!flag2[ch-97])
                s+=ch;
         }
         for(int i=0;i<s2.length();i++)
         {
             char ch=s2.charAt(i);
             if(flag2[ch-97]&&!flag1[ch-97])
                s+=ch;
         }
         if(s.length()==0)
         {
             return "-1";
             
         }
         return s;
     }
     
	public static void main (String[] args)
	 {
	 //code
    	Scanner sc=new Scanner(System.in);
    	int t=sc.nextInt();
    	while(t-->0)
    	{
    	    String s1=sc.next();
    	    String s2=sc.next();
    	    System.out.println(common(s1,s2));
    	}
	 }
}