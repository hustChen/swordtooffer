/**
 * Created by chensq on 17-2-4.
 */
public class ReConstructBinaryTree {

    public static void main(String[] args){
        int[] pre={1,2,4,7,3,5,6,8};
        int[] in={4,7,2,1,5,3,8,6};
        ReConstructBinaryTree reConstructBinaryTree=new ReConstructBinaryTree();
        TreeNode node=reConstructBinaryTree.build(pre,in,0,in.length-1,0,pre.length-1);
        reConstructBinaryTree.postOrder(node);
    }

    public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        return null;
    }

    public void postOrder(TreeNode node){
        if(node==null)
            return;

        System.out.println(node.val);
        postOrder(node.left);

        postOrder(node.right);

    }

    public TreeNode build(int[] pre,int[] in,int begin_in,int end_in,int begin_pre,int end_pre){

        if(begin_pre==pre.length||begin_pre>end_pre)
            return null;

        TreeNode root=new TreeNode(pre[begin_pre]);
        if(begin_in==end_in)
            return root;
        int i;
        for(i=begin_in;i<=end_in;i++)
            if(in[i]==pre[begin_pre])
                break;

        root.left=build(pre,in,begin_in,i-1,begin_pre+1,begin_pre+i-begin_in);
        root.right=build(pre,in,i+1,end_in,begin_pre+i-begin_in+1,end_pre);

        return root;
    }


}

class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
 }
