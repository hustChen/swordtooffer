import java.util.ArrayList;

/**
 * Created by chensq on 17-2-9.
 * 为毛要从跟节点一直到叶子节点，无聊
 */
public class FindPath {
    ArrayList<ArrayList<Integer>> result=new ArrayList<>();
    ArrayList<Integer> tmp=new ArrayList<>();
    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {
        find(root,target);
        return result;
    }

    private void find(TreeNode node,int target){
        if(node==null)
            return;
        tmp.add(node.val);
        if(target-node.val==0&&node.right==null&&node.left==null)
            result.add(new ArrayList<>(tmp));

        find(node.left,target-node.val);
        find(node.right,target-node.val);
        tmp.remove(tmp.size()-1);
    }

    private class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }

    }

}
