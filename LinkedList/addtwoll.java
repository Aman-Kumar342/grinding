public class addtwoll {
    class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }
    ListNode head;
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
    public ListNode addition(ListNode l1, ListNode l2){
        ListNode dummy=new ListNode(0);
        ListNode temp=dummy;
        int carry=0;
        while(l1!=null || l2!=null || carry !=0){
            int sum=carry;
            if(l1!=null){
                sum=sum+l1.val;
                l1=l1.next;
            }
            if(l2!=null){
                sum+=l2.val;
                l2=l2.next;
            }
            carry=sum/10;
            int digit=sum%10;
            temp.next=new ListNode(digit);
            temp=temp.next;
        }
        return dummy.next;
    }
    public ListNode addtwo(ListNode l1,ListNode l2){
        l1=reverseList(l1);
        l2=reverseList(l2);
        ListNode result=addition(l1,l2);
        return reverseList(result);
    }
}
