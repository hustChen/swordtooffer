/**
 * Created by chensq on 17-2-9.
 */
public class ReverseList {

    public ListNode reverseList(ListNode head) {
        if(head==null)
            return head;
        ListNode p,q,r;
        p=head;
        q=p.next;
        while(q!=null){
            r=q.next;
            q.next=p;
            p=q;
            q=r;
        }

        head.next=null;
        return p;
    }

    class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }
}
