/**
 * Created by chensq on 17-2-5.
 */
public class findKthToTail {
    public ListNode FindKthToTail(ListNode head,int k) {
        int count=0;
        ListNode p=head;
        while(p!=null&&count<k){
            p=p.next;
            count++;
        }

        if(count<k)
            return null;

        ListNode p2=head;
        while(p!=null){
            p=p.next;
            p2=p2.next;
        }

        return p2;
    }

    class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }
}


