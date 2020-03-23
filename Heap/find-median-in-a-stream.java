import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
	public static void main (String[] args)
	{
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    Queue<Integer> max_heap=new PriorityQueue<>(Collections.reverseOrder());
	    Queue<Integer> min_heap=new PriorityQueue<>();
	    for(int i=0;i<n;i++)
	    {
	        int e=sc.nextInt();
	        max_heap.add(e);
	        min_heap.add(max_heap.poll());
	        if(max_heap.size()<min_heap.size())
	        {
	            max_heap.add(min_heap.poll());
	        }
	        if(max_heap.size()==min_heap.size())
	        {
	            System.out.println((max_heap.peek() + min_heap.peek())/2);
	        }
	        else
	        {
	            System.out.println(max_heap.peek());
	        }
	    }
	}
}