public class SinglyLinkedList {
    public Node head;
    public SinglyLinkedList() {
        this.head = null;
    }
    
    public void add(int value) {
        Node newNode = new Node(value);
        if(head == null) {
            head = newNode;
        } else {
            Node runner = head;
            while(runner.next != null) {
                runner = runner.next;
            }
            runner.next = newNode;
        }
    }  

    public void remove() {
        
        
          
        Node runner = head;
        while(runner.next != null) {
            runner = runner.next;
            if (runner.next.next == null){
                runner.next=null;
            }


            }  
        
    }

    public void printValues(){

        Node runner = head;
        while(runner.next != null) {
            runner = runner.next;


            System.out.println(runner.value);
        }
    }
}