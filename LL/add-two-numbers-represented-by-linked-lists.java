class Add {
    
    // This function will add the numbers represented by two linked lists
    Node addTwoLists(Node first, Node second) {
        //
        Node res=null;
        Node prev=null;
        Node temp=null;
        int carry=0;
        int sum=0;
        while(first!=null  || second!=null)
        {
            sum= carry + (first!=null? first.data:0) + (second!=null?second.data:0);
            carry=(sum>=10)?1:0;
            sum=sum%10;
            temp=new Node(sum);
            if(res==null)
            {
                res=temp;
                
            }
            else
            {
                prev.next=temp;
            }
            prev=temp;
            
            if(first!=null)
            {
                first=first.next;
            }
            if(second!=null)
            {
                second=second.next;
            }
            if(carry >0)
            {
                temp.next=new Node(carry);
            }
        }
        return res;
    }
}