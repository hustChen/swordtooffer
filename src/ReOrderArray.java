/**
 * Created by chensq on 17-2-5.
 */
public class ReOrderArray {

    public static void main(String[] args){

        int[] data={1,2,3,4,5,6,7,8,9,10};
        ReOrderArray reOrderArray=new ReOrderArray();
        reOrderArray.reOrderArray(data);
    }

    public void reOrderArray(int [] array) {
        int p1=0;int p2;
        for(;p1<array.length;p1++){
            if(array[p1]%2==0){
                for(p2=p1+1;p2<array.length&&array[p2]%2==0;p2++);
                if(p2==array.length)
                    break;
                int temp=array[p2];
                for(;p2!=p1;p2--){
                    array[p2]=array[p2-1];
                }
                array[p1]=temp;
            }
        }

        for(int i:array){
            System.out.println(i);
        }
    }
}
