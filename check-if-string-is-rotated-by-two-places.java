/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    static int ans(String a,String b)
	{
	    String s=b+b;
	    int n=a.length();
	    if(s.substring(2,2+n).equals(a) || s.substring(n-2,n-2+n).equals(a))
	        return 1;
        else
            return 0;
	}
	public static void main (String[] args) {
		//code
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		sc.nextLine();
		while(t-->0)
		{
		    String a=sc.nextLine();
		    String b=sc.nextLine();
		    int an= ans(a,b);
		    System.out.println(an);
		}
	}
	
}