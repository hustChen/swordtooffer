/**
 * Created by chensq on 17-2-9.
 */
public class MoreThanHalfNum_Solution {

    public static void main(String[] args){
        int[] data={1,2,3,2,2};
        System.out.println(moreThanHalfNum_Solution(data));
    }
    //more vote
    public static int moreThanHalfNum_Solution(int [] array) {

        if(array==null)
            return 0;
        if(array.length==1)
            return array[0];

        int count=1;
        int candidate=array[0];
        for(int i=1;i<array.length;i++){
            if(array[i]!=candidate)
                count--;
            else
                count++;
            if(count==0) {
                candidate = array[i];
                count=1;
            }
        }

        count=0;
        for(int i:array)
            if(i==candidate)
                count++;

        if(array.length<count*2)
            return candidate;
        return 0;
    }
}
