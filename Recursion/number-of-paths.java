
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    
    static int nofpaths(int n,int m)
    {
        if(n==1 || m==1)
        {
            return 1;
        }
        return nofpaths(n-1,m) + nofpaths(n,m-1);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,m,t;
        t=sc.nextInt();
        while(t-->0)
        {
            n=sc.nextInt();
            m=sc.nextInt();
            int p= nofpaths(n,m);
            System.out.println(p);
        }
    
    }
}