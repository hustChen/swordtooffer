import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by chensq on 17-2-7.
 */
public class PrintFromTopToBottom {
    public ArrayList<Integer> printFromTopToBottom(TreeNode root) {
        Queue<TreeNode> queue=new LinkedList<>();
        ArrayList<Integer> list=new ArrayList<>();
        if(root==null)
            return list;
        queue.add(root);
        while(!queue.isEmpty()){
            TreeNode node=queue.poll();
            list.add(node.val);
            if(node.left!=null)
                queue.add(node.left);
            if(node.right!=null)
                queue.add(node.right);
        }
        return list;
    }


    class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }

    }
}
