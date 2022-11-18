
class LinkedList{
    private Node head;
    private Node tail;
    
    class Node{
        int data;
        Node next;
        
        Node(int data){
            this.data = data;
            next = null;
        }
    }
    
    void printlist(){
        Node n = head;
        while(n!=null){
            System.out.print(n.data+" ");
            n = n.next;
        }
        
    }
    boolean isEmpty(){
        return head == null;
    }
    void insert( int data){
        if(isEmpty()){
            head = new Node(data);
            tail = head;
            return;
        }
        Node newNode = new Node(data);
        newNode.next  = head;
        head = newNode;
        
    }
    
    void insert(int data , int pos){
        int i=0 ;
        if(pos==0){
            Node newNode = new Node(data);
            newNode.next = head;
            head = newNode;
            return;
            
        }
        Node n= head;
        while(i<pos-1 || n!=null){
            i++;
            n = n.next;
        }
        Node newNode = new Node(data);
            newNode.next = n.next;
            n.next = newNode;
        
        
    }
    void insertLast(int data ){
        if(isEmpty()){
            head = new Node(data);
            tail = head;
        }
        Node curr = new Node(data);
        tail.next = curr;
        tail = curr;
        
    }
    
    void delete(int pos){
        if(isEmpty()){
            System.out.println("The List is Empty Idiot!!");
            return ;
        }
        if(pos==0){
            Node temp = head;
            
            head = head.next;
            temp.next = null;
            System.out.println(temp.data+" got deleted from the list, succesfully! ");
            return;
        }
        Node prev = null;
        Node curr = head;
        int i =0;
        
        while(i < pos || curr!=null){
                prev = curr;
                curr = curr.next;
                
        }
        Node temp = curr;
        prev.next = curr.next;
        temp.next = null;
        System.out.println(temp.data+" succesfully deleted !");
        return;
        
        
    }
    
    void delete(String str){
        if(str.equals("last")==true){
           Node prev = null;
           Node curr = head;
           while(curr!= null){
               prev = curr;
               curr = curr.next;
               
           }
          
           prev.next = null;
           tail = prev;
           System.out.println(prev.data+" deleted successfully");
           
           
        }
        
    }
    
    
}

public class LinkedList_implementation
{
    
	public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insert(10);
        list.insert(20);
        list.insertLast(30);
        list.delete(0);
        list.delete("last");
        list.printlist();
	}
}
