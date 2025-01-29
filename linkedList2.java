class linkedList2 {
    private int size;
    Node head;

    linkedList2() {
        this.size = 0;
    }

    
    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
            size++;
        }
    }

    // add-first,last
    public void addFirst(String data) {
        Node newNode = new Node(data);
        if(head==null)  {
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;

    }

    public void addLast(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }

        Node currNode = head;
        while (currNode.next != null) { 
            currNode = currNode.next;
        }

        currNode.next = newNode;
    }

    // print 
    public void printList() {
        if (head == null) {
            System.out.println("list is empty.");
            return;
        }

        Node currNode = head;
        while (currNode != null) { 
            System.out.print(currNode.data+" -> ");
            currNode = currNode.next;
        }
        System.out.println("Null");
    }

    // delete first
    public void deleteFirst() {
        if(head==null) {
            System.out.println("this list is empty");
            return;
        }
        size--;
        head = head.next;
    }

    // delete last 
    public void deleteLast () {
        if (head==null) {
            System.out.println("this list is empty.");
            return;
        }

        size --;
        if (head.next == null ) {
            head = null;
            return;
        }
        Node secondLast = head;
        Node lastNode = head.next;
        while (lastNode.next != null) {
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }

        secondLast.next = null;
    }

    // print size
    public int getsize() {
        return size;
    }

    // reversing the linked list(iterative)

    public void reverseIterate() {
        if (head == null || head.next == null) {
            return;
        }
        Node prevNode = head;
        Node currNode = head.next;

        while (currNode != null) {
            Node nextnode = currNode.next;
            currNode.next = prevNode;

            // update
            prevNode = currNode;
            currNode = nextnode;
        }

        head.next = null;
        head = prevNode;
    }

    // reversing the linked list (recurssive approach)

    public Node reverseRecursive(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node newHead = reverseRecursive(head.next);
        head.next.next=head;
        head.next=null;

        return newHead;
        }

    public static void main(String[] args) {

        //ques - how to reverse a string

        linkedList2 list = new linkedList2();
        list.addLast("1");
        list.addLast("2");
        list.addLast("3");
        list.addLast("4");

        list.printList();

        // list.reverseIterate();
        // list.printList(); 

        list.head = list.reverseRecursive(list.head); 
        list.printList();
    }

}