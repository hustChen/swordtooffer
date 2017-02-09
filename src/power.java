/**
 * Created by chensq on 17-2-5.
 */
public class power {
    public double Power(double base, int exponent) {
        if(base==0&&exponent!=0){
            return 0;
        }else if(base==0&&exponent==0)
            return 1;

        double result=1;
        for(int i=0;i<Math.abs(exponent);i++){
            result*=base;
        }

        if(exponent<0)
            return 1/result;
        return result;

    }
}
