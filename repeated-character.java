import java.lang.*;
import java.io.*;
import java.util.*;
class GFG
 {
	public static void main (String[] args)
	 {
	        Scanner sc=new Scanner(System.in);
	        int t=sc.nextInt();
	        for(int z=0;z<t;z++)
	        {
	            String str=sc.next();
	            int l=str.length();
	            int count=0;
	            int j;
	            char c='a';
	            for(int i=0;i<l;i++)
	            {
	                count=0;
	                for(j=i+1;j<l;j++)
	                {
	                    if(str.charAt(i)==str.charAt(j))
	                    {
	                        c=str.charAt(i);
	                        count++;
	                    }
	                    
	                }
	                
	                if(count>0)
	                    {
	                        System.out.println(c);
	                        break;
	                    }
	            }
	            if(count==0)
	                {
	                    System.out.println("-1");
	                }
	        }
	 }
}