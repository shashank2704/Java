import java.io.*;

class GFG {
    static long fact(int x)
    {
        if(x==0)
            return 1;
        return x*fact(x-1);
    }
	public static void main (String[] args) {
		//code
		Scanner sn = new Scanner(System.in);
		int cases = sn.nextInt();
		while(cases-- >0)
		{
		    int n = sn.nextInt();
		    int r = sn.nextInt();
		    int g = sn.nextInt();
		    int b = sn.nextInt();
		    int diff = n-(r+g+b);
		    long ans = 0;
		    for(int i=0;i<=diff;i++)
		    {
		        for(int j=0;j<=diff;j++)
		        {
		            int k=diff-(i+j);
		            if(k>=0)
		            {
		                ans+=fact(n)/(fact(r+i)*fact(g+j)*fact(b+k));
		            }
		        }
		    }
		    System.out.println(ans);
		}
	}
}