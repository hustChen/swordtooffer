import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by chensq on 17-2-9.
 * 可能有字符重复
 * 还要按字典顺序输出
 */
public class Permutation {

    public static void main(String[] args){
        System.out.println(new Permutation().permutation("abc"));
    }
    Set<String> result=new TreeSet<>();
    //ArrayList<String> result=new ArrayList<>();
    public ArrayList<String> permutation(String str) {
        perform(str.toCharArray(),0,str.length()-1);
        return new ArrayList<>(result);
    }

    private void perform(char[] str,int start,int end){
        if(start==end)
            result.add(new String(str));
        else{
            for(int i=start;i<=end;i++){
                char tmp=str[start];
                str[start]=str[i];
                str[i]=tmp;
                perform(str,start+1,end);
                tmp=str[start];
                str[start]=str[i];
                str[i]=tmp;
            }
        }
    }

}
