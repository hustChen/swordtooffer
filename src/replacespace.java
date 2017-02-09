/**
 * Created by chensq on 17-2-3.
 */
public class replacespace {

    public static int foo(int x){
        return x&-x;
    }

    public static void main(String[] args){

        System.out.println(foo(2<<31-3));
    }

    public static String repaceSpace(StringBuffer stringBuffer){
        int  len,count=0;
        len=stringBuffer.length();
        for(int i=0;i<len;i++){
            if(stringBuffer.charAt(i)==' ')
                count++;
        }
        int index=len+count*2-1;
        StringBuffer sb=new StringBuffer(index+1);
        for(int i=len-1;i>=0;i--){
            if(stringBuffer.charAt(i)==' '){
                sb.setCharAt(index--,'0');
                sb.setCharAt(index--,'2');
                sb.setCharAt(index--,'%');
            }else{}

        }

        return sb.toString();
    }
}
