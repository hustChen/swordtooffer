/**
 * Created by chensq on 17-2-4.
 */
public class MinNumberInRotateArray {

    public static void main(String[] args){
        int[] array={3,4,5,6,1};
        System.out.println(minNumberInRotateArray(array));
    }

    public static int minNumberInRotateArray(int [] array) {
        if(array.length==0)
            return 0;
        int head=0;
        int tail=array.length-1;

        if(array[head]==array[tail]){
            for(;head<tail;head++){
                if(array[head]>array[head+1])
                    return array[head+1];
            }
        }
        int mid;
        while(tail-head>1){
            mid=(tail+head)/2;
            if(array[mid]<array[tail])
                tail=mid;
            else
                head=mid;
        }

        return array[tail];

    }
}
