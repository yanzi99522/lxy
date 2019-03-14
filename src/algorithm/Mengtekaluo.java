package algorithm;

import java.util.Scanner;

public class Mengtekaluo {//蒙特卡罗算法

    static double MontePI(int n) {
        double PI;
        double x, y;
        int i, sum;
        sum = 0;
        for (i = 1; i < n; i++) {
            x = Math.random();//产生0到1 之间的一个随机数
            y = Math.random();
            if ((x * x + y * y) <= 1) //若在阴影区域
                sum++;//计数
            }
            PI = 4.0 * sum / n;//计算PI
            return PI;
    }




    public static void main(String[] args) {
        int n;
        double PI;
        System.out.println("蒙特卡洛概率计算π");
        Scanner input=new Scanner(System.in);
        System.out.println("输入点的数量：");
        n=input.nextInt();//输入撒点数
        PI=MontePI(n);//计算PI
        System.out.println("PI="+PI);//输出结果
    }
}
