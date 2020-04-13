class QuickSort
{
    /* This function takes last element as pivot, places  the pivot element 
    at its correct position in sorted  array, and places all smaller (smaller
    than pivot) to left of pivot and all greater elements to right  of pivot */
    static int partition(int arr[], int low, int high)
    {
        // add your code here
         int p=low-1,temp;
         
         for(int i=low;i<high;i++)
         {
             if(arr[i]<=arr[high])
             {
                 ++p;
                 temp=arr[p];
                 arr[p]=arr[i];
                 arr[i]=temp;
             }
         }
         temp=arr[p+1];
         arr[p+1]=arr[high];
         arr[high]=temp;
         
         return p+1;
        
        
        
    } 
}