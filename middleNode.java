/****************************************************************

 Following is the class structure of the Node class:
*/
 class Node {
     public int data;
     public Node next;

     Node()
     {
         this.data = 0;
         this.next = null;
     }
     Node(int data)
     {
         this.data = data;
         this.next = null;
     }
     Node(int data, Node next)
     {
         this.data = data;
         this.next = next;
     }
 }

 //*****************************************************************/

public class middleNode
{
    public static Node findMiddle(Node head)
    {
     Node slow = head;
     Node fast = head;

     while(fast != null&&fast.next!=null ){
        fast = fast.next.next ;
        slow = slow.next;

     }
     return slow;
        // Write your code here.
    }
}