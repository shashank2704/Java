class MyQueue
{
    QueueNode front, rear;
    
    // This function should add an item at
    // rear
	void push(int a)
	{
        // Your code here
        QueueNode node=new QueueNode(a);
        if(front==null)
        {
            front=node;
            rear=node;
            front.next=null;
            rear.next=null;
            
        }
        else
        {
            rear.next=node;
            rear=node;
        }
	}
	
    // This function should remove front
    // item from queue and should return
    // the removed item.
	int pop()
	{
        // Your code here
        if(front==null)
        {
            return -1;
        }
        else
        {
            int x=front.data;
            front=front.next;
            return x;
        }
        
	}
}




