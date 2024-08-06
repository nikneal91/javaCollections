package blind75;

import java.util.HashMap;
import java.util.Map;

public class DetectCycle {
    public static void main(String[] args) {
         // Create a sample linked list
        // with a loop for testing
        ListNode head = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(3);
        ListNode fourth = new ListNode(4);
        ListNode fifth = new ListNode(5);

        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        // Create a loop
        fifth.next = third;

        // Check if there is a loop
        // in the linked list
        if (detectLoop(head)) {
            System.out.println("Loop detected in the linked list.");
        } else {
            System.out.println("No loop detected in the linked list.");
        }

        // No need to explicitly free memory
        // in Java; the garbage collector handles it 
    }

    private static boolean detectLoop(ListNode head) {
        ListNode temp = head;
        Map<ListNode,Integer> hm = new HashMap<>();

        while ( temp!=null) {
            if ( hm.containsKey(temp)) 
                return true;
            hm.put(temp,1);
            temp = temp.next;
        }
        return false;
    }
}
