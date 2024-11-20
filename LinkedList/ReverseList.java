 //iterative approach
 
 public void reverseList(){
        Node prev=null;
        Node current = head;
        tail=head;
        while(current!=null){
            Node nextnode=current.next;
            current.next=prev;
            prev=current;
            current=nextnode;
        }
        head=prev;
    }

// recursive approach
public Node reverseListRecursive(Node head) {
    if (head == null || head.next == null) {
        return head;
    }
    Node newHead = reverseListRecursive(head.next);
    head.next.next = head;
    head.next = null;
    return newHead;
}

