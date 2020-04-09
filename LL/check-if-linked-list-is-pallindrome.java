class Palindrome
{
    // Function to check if linked list is palindrome
    boolean isPalindrome(Node head) 
    {
        //Your code here
       Node node=head;
       boolean flag=true;
       Stack<Integer> stack=new Stack<Integer>();
       while(node!=null)
       {
           stack.push(node.data);
           node=node.next;
       }
       node=head;
       while(head!=null)
       {
           int i=stack.pop();
           if(head.data==i)
           {
               flag=true;
           }
           else
           {
               flag=false;
               break;
           }
           head=head.next;
           
       }
       return flag;
    }    
}