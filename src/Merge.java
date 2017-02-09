/**
 * Created by chensq on 17-2-9.
 */
public class Merge {
    public ListNode merge(ListNode list1,ListNode list2) {
        if(list1==null)
            return list2;
        if(list2==null)
            return list1;
        ListNode node=null;
        if(list1.val<list2.val){
            node=list1;
            list1=list1.next;
        }else{
            node=list2;
            list2=list2.next;
        }
        node.next=merge(list1,list2);
        return node;
    }

    class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }
}
