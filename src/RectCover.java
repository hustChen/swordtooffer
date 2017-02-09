/**
 * Created by chensq on 17-2-9.
 * like jumpFloor
 */
public class RectCover {
    public int rectCover(int target) {
        if(target==0)
            return 0;
        if(target==1)
            return 1;
        if(target==2)
            return 2;
        else{
            return rectCover(target-1)+1+rectCover(target-2)+2;
        }
    }
}
