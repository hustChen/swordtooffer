/**
 * Created by chensq on 17-2-3.
 */
public class TwoDMetrixFind {
    public boolean Find(int target,int[][] array){
        int m=0;
        int n=array[0].length-1;

        while(m<=array.length-1&&n>=0){
            if(array[m][n]==target)
                return true;
            if(target>array[m][n]){
                m++;
            }else{
                n--;
            }
        }

        return false;
    }
}
