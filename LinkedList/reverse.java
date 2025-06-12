
class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class reverse {
    ListNode head;

    public void add(int data) {
        ListNode newNode = new ListNode(data);
        if (head == null) {
            head = newNode;
            return;
        }

        ListNode curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }

        curr.next = newNode;
    }
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode temp = head;
        ListNode prev = null;

        while (temp != null) {
            ListNode curr = temp.next;
            temp.next = prev;
            prev = temp;
            temp = curr;
        }

        return prev;
    }

    public void printList(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        reverse list = new reverse();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        System.out.println("Original List:");
        list.printList(list.head);

        list.head = list.reverseList(list.head);

        System.out.println("Reversed List:");
        list.printList(list.head);
    }
}
