package basicMathProblem;

import java.util.Random;

public class SuijiShu6_7 {
    public static void main(String[] args) {
        int i,j;//声明变量

        Random r=new Random();//随机种子

        for (j=0;j<10;j++){
            for (i=0;i<10;i++){
                System.out.printf("%3d ", r.nextInt(100));//输出0-100之间的随机整数
            }
            System.out.println();
        }
    }
}
