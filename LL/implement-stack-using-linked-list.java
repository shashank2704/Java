class MyStack {

    // Note that top is by default null
    // in Java
    StackNode top;

    void push(int a) {
        // Add your code here
        if(top==null)
        {
            top=new StackNode(a);
            
        }
        else
        {
            StackNode temp=new StackNode(a);
            temp.next=top;
            top=temp;
        }
        
        
    }
    int pop() {
        // Add your code here
        StackNode temp=top;
        
        if(temp==null)
        {
            return -1;
        }
        else
        {
            temp=temp.next;
            int r=top.data;
            top=temp;
            return r;
        }
    }
}