import java.lang.*;
import java.io.*;
import java.util.*;
class Main {
	public static void main (String[] args) {
	 Scanner s=new Scanner(System.in);
	 int t=s.nextInt();
	 while(t-->0)
	 {
	     String st=s.next();
	     char[] ch=st.toCharArray();
	     Arrays.sort(ch);
	     String str=String.valueOf(ch);
	     permutation("",str);
	     System.out.println();
	 }
		
	}
	public static void permutation(String prefix,String str)
	{
	    int n=str.length();
	    if(n==0)
	    {
	        System.out.print(prefix+" ");
	    }
	    else
	    {
	        for(int i=0;i<n;i++)
	        {
	            permutation(prefix+str.charAt(i), str.substring(0,i)+str.substring(i+1,n));
	        }
	    }
	}

}