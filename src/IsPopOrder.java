import java.util.Stack;

/**
 * Created by chensq on 17-2-7.
 */
public class IsPopOrder {

    public static void main(String[] args){
        int[] push={1,2,3,4,5};
        int[] pop={4,3,5,1,2};//{4,5,3,2,1};
        System.out.println(isPopOrder(push,pop));
    }

    public static boolean isPopOrder(int [] pushA,int [] popA) {
        Stack<Integer> stack=new Stack<>();
        int i=0;
        for(int num:popA){
           for(;i<pushA.length&&pushA[i]!=num;i++)
               stack.push(pushA[i]);
           if(i!=pushA.length) {
               stack.push(pushA[i]);
               i++;
           }
           if(stack.peek()==num) {
               stack.pop();
           }
           else
               return false;
        }

        return true;
    }
}
