/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine().trim());
        while(t-->0)
        {
            String str=br.readLine().trim();
            char[] arr=str.toCharArray();
            int length=0, startindex=-1,endindex=-1;
            for(int i=0;i<arr.length-1;i++)
            {
                for(int j=i+1;j<arr.length;j++)
                {
                    if(ispalidrome(arr,i,j)&& j-i+1>length)
                    {
                         length=j-i+1;
                         startindex=i;endindex=j;
                    }
                }
            }
            if(startindex==-1)
            {
                System.out.println(arr[0]);
            }
            else
            {
                System.out.println(str.substring(startindex,endindex+1));
            }
        }
    }
    public static boolean ispalidrome(char[] arr,int i,int j)
    {
        int m=i,n=j;
        while(m<n)
        {
            if(arr[m]!=arr[n])
            {
                return false;
            }
            m++;
            n--;
        }
        return true;
    }
}