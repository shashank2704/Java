/*package whatever //do not write package name here */


import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
		    String str=sc.next();
		    System.out.println(dup(str));
		    
		}
    }
    public static String dup(String str)
    {
        String res="";
        for(int i=0;i<str.length();i++)
        {
            if(i<str.length()-1 && str.charAt(i)==str.charAt(i+1))
            {
                while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1))
                {
                    i++;
                }
                i++;
            }
            if(i<str.length())
            {
                res+=str.charAt(i);
            }
        }
            if(res.length()==str.length())
            {
                return res;
            }
            
        
        return dup(res);
    }
    
}