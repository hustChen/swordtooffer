/**
 * Created by chensq on 17-2-9.
 */
public class Convert {
    public TreeNode Convert(TreeNode pRootOfTree) {

        if(pRootOfTree==null)
            return null;

        if(pRootOfTree.left==null&&pRootOfTree.right==null)
            return pRootOfTree;
        TreeNode curnode=pRootOfTree;
        TreeNode head=Convert(pRootOfTree.left);
        TreeNode next=Convert(pRootOfTree.right);

        if(head!=null) {
            head.left = null;
            TreeNode tmp = head;
            while (tmp.right != null)
                tmp = tmp.right;
            tmp.right = curnode;
            curnode.left=tmp;
        }else {
            curnode.left = head;
            head = curnode;
        }

        curnode.right=next;
        if(next!=null)
        next.left=curnode;

        return head;
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
