class GfG
{
    void deleteNode(Node node)
    {
         // Your code here
         Node temp=node.next;
         node.data=temp.data;
         node.next=temp.next;
         temp=null;
         
         
    }
}