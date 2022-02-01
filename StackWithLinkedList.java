import javax.xml.validation.Validator;

public class StackWithLinkedList {
    private Node head;
    private class Node{
         int value;
         Node next;
    }

    public StackWithLinkedList(){
        head = null;
    }

    public void push(int s){
        Node oldhead = head;
        head = new Node();
        head.value = s;
        head.next = oldhead;

    }

    public int pop(){
        if(head == null){
            System.out.println("Stack Underlflow state !!");
            System.exit(1);
        }
        int value = head.value;
        head = head.next;

        return value ;

    }

    public static void printList(Node head){
        Node temp = head;
        while (temp != null ){
            System.out.format("%d", temp.value );
            temp = temp.next;
            System.out.println();
        }
        
    }
    public static void main(String[] args){
        StackWithLinkedList lls = new StackWithLinkedList();

        lls.push(20);
        lls.push(56);
        lls.push(48);
        lls.push(32);
        lls.push(11);
        System.out.println("Element removed from Linked List : "+ lls.pop());
        lls.push(100);
        
        printList(lls.head);

    
    }


}
