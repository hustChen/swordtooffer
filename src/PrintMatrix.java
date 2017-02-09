import java.util.ArrayList;
import java.util.List;

/**
 * Created by chensq on 17-2-9.
 */
public class PrintMatrix {

    public static void main(String[] args){
        int[][] numbers=
                {{1,2,3,4},
                 {5,6,7,8}, {9,10,11,12},{13,14,15,16}};
        List<Integer> result;
        PrintMatrix printMatrix_obj=new PrintMatrix();
        result=printMatrix_obj.printMatrix(numbers);
        System.out.println(result);
    }

    public ArrayList<Integer> printMatrix(int [][] matrix) {
        ArrayList<Integer> list=new ArrayList<>();
        if(matrix==null)
            return list;
        int rows=matrix.length;
        int column=matrix[0].length;

        int start=0;
        while(column>start*2&&rows>start*2){
            printMaxtrixinCircle(matrix,start,list);
            ++start;
        }
        return list;
    }

    private void printMaxtrixinCircle(int[][] numbers, int start, List<Integer> list){
        int cl_end=numbers[0].length-1-start;
        int row_end=numbers.length-1-start;
        int i;
        for(i=start;i<=cl_end;i++){
            list.add(numbers[start][i]);
        }
        int j;
        if(start<row_end)
            for(j=start+1;j<=row_end;j++){
                list.add(numbers[j][cl_end]);
            }
        if(start<cl_end&&start<row_end)
            for(i=cl_end-1;i>=start;i--){
                list.add(numbers[row_end][i]);
            }
        if(start<cl_end&&start<row_end-1)
        for(j=row_end-1;j>start;--j){
            list.add(numbers[j][start]);
        }

    }
}
