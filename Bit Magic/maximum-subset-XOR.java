class GfG
{
             public static int maxXOR(int a[],int low,int high,int xor,int max)
             {
                 if(low>high)
                 {
                     if(xor>max)
                     {
                         max=xor;
                     }
                     
                 }
                 else
                 {
                     int w=maxXOR(a,low+1,high,xor^a[low],max);
                     int w1=maxXOR(a,low+1,high,xor,max);
                     max=Math.max(max,Math.max(w,w1));
                 }
                 return max;
             }
              public static int maxSubarrayXOR(int set[], int n)
                {
                     //add code here.
                    return maxXOR(set,0,n-1,0,0);
                }
}