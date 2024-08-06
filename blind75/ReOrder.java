package blind75;

public class ReOrder {

 // Function to print the linked list
 public static void printLinkedList(ListNode head) {
    ListNode temp = head;
    while (temp != null) {
        System.out.print(temp.data + "  -->  ");
        temp = temp.next;
    }
    System.out.print("NULL");
    System.out.println();
}

static ListNode reverse(ListNode head){
    ListNode curr = head;
    ListNode prev = null;
    ListNode nextt = null;
    
    while(curr != null){
        nextt = curr.next;
        curr.next = prev;
        prev = curr;
        curr = nextt;
    }
    return prev;
}

static ListNode middle(ListNode head){
    ListNode slow = head;
    ListNode fast = head;   
    while(fast.next != null && fast.next.next != null){
        slow = slow.next;
        fast = fast.next.next;
    }
    return slow;
}

public  static void reorderList(ListNode head) {
    if(head == null || head.next == null)
        return;
    
    ListNode mid = middle(head);
    ListNode k = reverse(mid.next);
    mid.next = null;
    
    ListNode c1 = head;
    ListNode c2 = k;
    ListNode f1 = null;
    ListNode f2 = null;
    
    while(c1 != null && c2 != null){
        f1 = c1.next;
        f2 = c2.next;
        
        c1.next = c2;
        c2.next = f1;
        
        c1 = f1;
        c2 = f2;
    }
}

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(3);
        ListNode fourth = new ListNode(4);
        ListNode fifth = new ListNode(5);

        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;

        printLinkedList(head);
        reorderList(head);
        printLinkedList(head);

    }
}
