import java.util.Stack;

/**
 * Created by chensq on 17-2-3.
 */
public class minstack {
    Stack<Integer> data=new Stack<>();
    Stack<Integer> min_stack=new Stack<>();

    public void push(int node){
        data.push(node);

        if(min_stack.empty()) {
            min_stack.push(node);
            return;
        }

        if(node<min_stack.peek()){
            min_stack.push(node);
        }else
            min_stack.push(min_stack.peek());
    }

    public void pop(){
        data.pop();
        min_stack.pop();
    }

    public int top(){
        return data.peek();
    }

    public int min(){
        return min_stack.peek();
    }

}
