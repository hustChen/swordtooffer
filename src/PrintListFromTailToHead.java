import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created by chensq on 17-2-4.
 */
public class PrintListFromTailToHead {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        Stack<Integer> stack=new Stack<>();
        while(listNode!=null){
            stack.push(listNode.val);
            listNode=listNode.next;
        }

        ArrayList<Integer> result=new ArrayList<>();
        while(!stack.empty()){
            result.add(stack.pop());
        }

        return result;
    }
}

class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}


/**
    public class ListNode {
         int val;
         ListNode next = null;

         ListNode(int val) {
             this.val = val;
         }
     }
 *
 */
