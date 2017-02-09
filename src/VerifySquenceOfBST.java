/**
 * Created by chensq on 17-2-9.
 */
public class VerifySquenceOfBST {

    public static void main(String[] args){
        int[] sequence={5,7,6,9,11,10,8};
        int[] sequence2={7,4,6,5};
       VerifySquenceOfBST v=new VerifySquenceOfBST();
       System.out.println(v.verifySquenceOfBST(sequence));
       System.out.println(v.verifySquenceOfBST(sequence2));
    }

    public boolean verifySquenceOfBST(int [] sequence) {

        if(sequence==null||sequence.length==0)
            return false;

        return verify(sequence,0,sequence.length-1);
    }

    private boolean verify(int[] sequence,int start,int end){
        boolean result=false;
        if(sequence==null)
            return result;
        if(end==start)
            return true;
        int root=sequence[end];
        int i;
        for(i=start;i<end&&sequence[i]<root;i++);
        for(int j=i;j<end;j++){
            if(sequence[j]<root)
                return false;
        }
        boolean left=true;
        boolean right=true;
        if(i-start>0)
            left=verify(sequence,start,i-1);
        if(end-i>0)
            right=verify(sequence,i,end-1);
        return left&&right;
    }

}
