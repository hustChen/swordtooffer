/**
 * Created by chensq on 17-2-5.
 */
public class Numberof1 {
    public int numberof1(int n){
        int count=0;
        while(n!=0){
            count++;
            n=n&(n-1);
        }
        return count;
    }
}
