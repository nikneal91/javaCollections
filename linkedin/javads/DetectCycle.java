package linkedin.javads;

class CustomList {
  public ListNode head;    

  
}

class ListNode {
    int data;
    ListNode next;

    public ListNode(int value) {
        this.data = value;
    }
}

public class DetectCycle {
    public static void main(String[] args) {
        CustomList list = new CustomList();
        list.head= new ListNode(0);
        list.head.next = new ListNode(1);
        list.head.next.next = new ListNode(2);
        list.head.next.next.next = new ListNode(3);
        list.head.next.next.next.next = new ListNode(2);
        printList(list.head);
    }

    private static void printList(ListNode head) {
        ListNode current = head;
        while ( current != null) {
            System.out.print(current.data + " --> ");
            current = current.next;
        }

    }
}
