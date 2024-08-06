package blind75;

import java.util.Stack;

class ListNode {
    ListNode next;
    int data;

    public ListNode(int val) {
        this.data = val;
    }

}


public class ReverseLinkedList {
    
    public static ListNode reverseLinkedListRec(ListNode head) {
        ListNode current = head;
        ListNode prev = null;
        ListNode nextt = null;

        while ( current!=null) {
            nextt = current.next;
            current.next=prev;
            prev=current;
            current=nextt;
        }
        return prev;
    }



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

    public static void main(String[] args) {
        
        ListNode head = new ListNode(1);
        head.next = new ListNode(3);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(4);

        // Print the original linked list
        System.out.print("Original Linked List: ");
        printLinkedList(head);

        System.out.print("Reversed Linked List: ");
        
        head = reverseLinkedListRec(head);
        
        
        printLinkedList(head);
    

    }

    private static ListNode reverseLinkedList(ListNode head) {
        ListNode temp = head;

        Stack<Integer> st = new Stack<>();
        while (temp!=null) {
            st.push(temp.data);
            temp=temp.next;
        }
        
        temp = head;
        while ( temp!=null && !st.isEmpty()) {
            temp.data= st.pop();
            temp = temp.next;
        }

        return head;
    }

}
