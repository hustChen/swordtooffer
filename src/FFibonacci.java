/**
 * Created by chensq on 17-2-5.
 */
public class FFibonacci {
    public int Fibonacci(int n) {
        int a=1;
        int b=1;
        int result=0;
        //if(n==0)
        //    return 0;
        if(n==1||n==2)
            return 1;
        for(int i=2;i<=n;i++){
            result=a+b;
            a=b;
            b=result;
        }

        return result;
    }
}
