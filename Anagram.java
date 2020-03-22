import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    public static boolean anagram(String s1,String s2)
    {
        int h1[]=new int[26];
	    int h2[]=new int[26];
	    Arrays.fill(h1,0);
	    Arrays.fill(h2,0);
	    int i;
	    if(s1.length()!=s2.length())
	    {
	        return false;
	    }
	    for(i=0;i<s1.length();i++)
	    {
	        h1[s1.charAt(i)-'a']++;
	    }
	    for(i=0;i<s2.length();i++)
	    {
	        h2[s2.charAt(i)-'a']++;
	    }
	    for(i=0;i<26;i++)
	    {
	        if(h1[i]!=h2[i])
	        {
	            return false;
	        }
	    }
	    return true;
    }
	public static void main (String[] args)throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t-->0)
		{
		    String str = br.readLine();
		    String s1 = str.split(" ")[0];
		    String s2 = str.split(" ")[1];
		    if(anagram(s1,s2))
		    {
		        System.out.println("YES");
		    }
		    else
		    {
		         System.out.println("NO");
		    }
		    
		    
		    
		}
	}
}
