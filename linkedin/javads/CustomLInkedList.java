package linkedin.javads;


class Node  {
    int data ;
    Node next;
    
    public Node(int data) {
        this.data = data;
    }
}

class CustomList {
    public Node head;

    public void displayContents() {
        Node current = head;
        while (current!=null) {
            System.out.print(current.data + "->");
            current = current.next;
        }
        System.out.println();
    }

    public void deleteHalf() {
        if ( head ==null || head.next==null) {
            head=null;
            return;
        }
        Node slow =head;
        Node fast = head;
        Node prev=null;
        while (fast!=null && fast.next!=null) {
            fast = fast.next.next;
            prev=slow;
            slow = slow.next;
        }
        slow.next=null;

    }

}

public class CustomLInkedList {
    
    public static void main(String[] args) {
        CustomList ll = new CustomList();
        Node first = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(4);

        ll.head=first;
        first.next=second;
        second.next=third;
        third.next=fourth;

        ll.displayContents();
        ll.deleteHalf();
        ll.displayContents();
    }
}
