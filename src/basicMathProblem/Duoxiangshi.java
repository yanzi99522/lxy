package basicMathProblem;

import java.text.DecimalFormat;

public class Duoxiangshi {
    static double polynomiallD(double a[],int n,double x){
        int i;
        double result;
        result=a[n-1];
        for (i=n-2;i>=0;i--){//递推算法计算
            result=result*x+a[i];
        }
        return result;//返回计算结果
    }

    public static void main(String[] args) {
        int i;
        double a[]={-15.0,-7.0,7.0,2.0,3.0};
        double[] x={-2.0,-0.5,2.0,3.7,4.0};
        double result;

        DecimalFormat df=new DecimalFormat("0.0000000E000");
        DecimalFormat df1=new DecimalFormat("0.00");

        System.out.println();

        for (i=0;i<6;i++){
            result=polynomiallD(a,7,x[i]);
            System.out.print("x="+df1.format(x[i])+"时，p(x)="+df.format(result)+"\n");
        }
        System.out.println();
    }
}
