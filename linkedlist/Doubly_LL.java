package java_DSA.linkedlist;

public class Doubly_LL {
 private Node head;
    private Node tail;
    private int size;
    public Doubly_LL() {
        this.size = 0;
    }
    private class Node {
        private int value;
        private Node next;
        private Node previous;

        public Node(int value) {
            this.value = value;
        }
        public Node(int value, Node next ,Node previous) {
            this.value = value;
            this.next = next;
            this.previous=previous;
        }
    }
    public void insert(int value){
        Node newNode = new Node(value);
       if(tail==null){
        insertAtBeginning(value);
       }
        else {
            newNode.previous=tail;
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }
    public void insertAtBeginning(int value){
        Node newnode = new Node(value);
        if ((head==null)) {
            head = newnode ;
           
        } else {
            
            newnode.next = head;
            newnode.previous=null;
            head.previous=newnode;
            head = newnode;
        }
        size++;
    }
    public int size() {
        return size;
    }
    public void display(){

        if(head == null){
            System.out.println("List is empty");
            return;
        }
        Node current = head;
        Node last = null;
        while(current != null){
            System.out.print(current.value + "->");
            last=current;
            current = current.next;
        }
        System.out.println("null");
        System.out.println("print in reverse");
        while (last!=null) {
         System.out.print(last.value+ "->");
         last=last.previous;   
        }
    }
    
    public void insertAtposition(int value,int position){
        if(position <0|| position>size){
            System.out.println("Invalid position");
            return;
        }
        if(position == 0){
            insertAtBeginning(value);
            return;
        }
       if(position ==size){
           insert(value);
           return;
       }
       Node current = head;
       for(int i = 1; i < position ; i++){
           current = current.next;
       }
       Node newNode = new Node(value, current.next,current);
       current.next.previous=newNode;
       current.next = newNode;
       size++;
    }
    public int  deletefirst( ){
        if(head ==null){
            System.out.println("List is empty");
            return -1;
        }
        int deletedValue = head.value;
        head = head.next;
        head.previous=null;
        size--;
        if(head == null) {
            tail = null; // If the list becomes empty, update tail
        }
        return deletedValue;
    }
    public Node finid(int value){
        Node node = head;
        while(node!=null){
            if(node.value==value){
                return node;
            }
            node = node.next;
        }
        return null;
        
    }
    public Node get(int index){
        if(index < 0 || index >= size) {
            System.out.println("Index out of bounds");
            return null;
        }
        Node current = head;
        for(int i = 0; i < index; i++) {
            current = current.next;
        }
        return current;
    }
    public int deletelast(){
       if(size<=1){
       return deletefirst();
       }
        Node current = get(size - 2);
         int deletedValue = tail.value;
         tail.previous=null;
         tail = current;
         tail.next = null;
         size--;
         return deletedValue;
    }
    public void getvalue(int index){
        System.out.println(get(index).value);
    }
    public int delete(int index){
        if(index==0){
            return deletefirst();
        }
        if(index==size-1){
            return deletelast();
        }
        Node prev=get(index-1);
        int val = prev.next.value;
        prev.next=prev.next.next;

        return val;
    }
}
