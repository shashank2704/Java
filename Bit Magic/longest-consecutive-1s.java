import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
    public static int maxcons(int n)
    {
        int count=0;
        while(n!=0)
        {
            n=(n & (n<<1));
            count++;
        }
        return count;
    }
   
	public static void main (String[] args)
	 {
	 //code
	        Scanner sc=new Scanner(System.in);
	        int t=sc.nextInt();
	        while(t-->0)
	        {
	            int n=sc.nextInt();
	            System.out.println(maxcons(n));
	        }
	 
	 
	}
}