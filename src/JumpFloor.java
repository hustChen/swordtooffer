/**
 * Created by chensq on 17-2-7.
 */
public class JumpFloor {
    public int jumpFloor(int target) {
        return jump(target);
    }

    private int jump(int target){
        int result;
        if(target==0)
            return 0;
        if(target==1)
            return 1;
        if(target==2)
            return 2;
        else
            return jump(target-1)+jump(target-2);
    }

}
