/**
 * Created by chensq on 17-2-7.
 */
public class Mirror {
    public void mirror(TreeNode root) {
        change(root);
    }

    private TreeNode change(TreeNode node){

        if(node==null)
            return node;

        TreeNode left=change(node.right);
        TreeNode right=change(node.left);
        node.left=left;
        node.right=right;
        return node;
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
