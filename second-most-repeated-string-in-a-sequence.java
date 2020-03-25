
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner scan=new Scanner(System.in);
		int t=scan.nextInt();
		while(t-->0)
		{
		  
		    int n=scan.nextInt();
		    String[] s=new String[n];
		    for(int i=0;i<n;++i)
		        s[i]=scan.next();
		    int a=0,b=0,c=0,x=-1,y=-1;
		    String s1="",s2="";
		    for(int i=0;i<n;++i)
		    {
		        if(s[i]=="")
		            continue;
		        b=1;
		        for(int j=i+1;j<n;++j)
		        {
		            if(s[j]=="")
		                continue;
		            if(s[i].equals(s[j]))
		            {
		                ++b;
		                s[j]="";
		            }
		        }
		        if(a==0)
		        {
		            a=b;
		            s1=s[i];
		            x=i;
		       //     System.out.println("1"+s1);
		        }
		        else if(b>a)
		        {
		            c=a;
		            s2=s1;
		            y=x;
		         //   System.out.println("2"+s2);
		            s1=s[i];
		            x=i;
		      //      System.out.println(s1);
		            a=b;
		        }
		        else if(b<a && b>c)
		        {
		             c=b;
		             s2=s[i];
		             y=i;
		        //     System.out.println("3"+s2);
		        }
		    }
		    System.out.println(s[y]);
		}
	}
}