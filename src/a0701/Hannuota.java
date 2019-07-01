package a0701;

import java.util.Scanner;

/**
 * @author lxy
 */
public class Hannuota {
    static long count;//移动的次数
    static void hanoi(int n,char a,char b,char c){
        if (n==1){
            System.out.println("第"+(++count)+"次移动，圆盘从"+a+"棒移动到"+c+"棒");
        }else {
            hanoi(n-1,a,c,b);
            System.out.println("第" + (++count) + "次移动，从" + a + "棒移动到" + c + "棒");
            hanoi(n-1,b,a,c);
        }
    }

    public static void main(String[] args) {
        System.out.println("汉诺塔问题求解：");
        System.out.println("请输入圆盘的数量：");
        Scanner in=new Scanner(System.in);
        while (in.hasNext()){
            int n=in.nextInt();
            hanoi(n,'A','B','C');
            System.out.println("求解完成，移动的所有次数是："+(count));
        }

    }

}
