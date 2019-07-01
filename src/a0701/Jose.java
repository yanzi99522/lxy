package a0701;

import java.util.Scanner;

/**
 * @author lxy
 */
public class Jose {
    static final int Num=41;
    static final int Kill=3;
    static void Jose(int alive){
        int[] man=new int[Num];
        int count=1;
        int i=0,pos=-1;
        while (count<=Num){
            do {
                pos=(pos+1)%Num;
                if (man[pos]==0){
                    i++;
                    if (i==Kill){
                        i=0;
                        break;
                    }
                }
            }while (true);

            man[pos]=count;
            System.out.println("初始位置第"+(pos+1)+"个位置上的人自杀，约瑟夫环数（名单序号）："+count);
            count++;
        }
        System.out.println("这"+alive+"个需要存活的人的初始位置");
        alive=Num-alive;
        for (i=0;i<Num;i++){
            if (man[i]>alive){
                System.out.println("初始编号"+(i+1));
            }
        }
    }

    public static void main(String[] args) {
        int alive;
        Scanner in=new Scanner(System.in);
        System.out.println("约瑟夫环问题求解");
        System.out.println("输入需要留存的人数量：");
        alive=in.nextInt();
        Jose(alive);
    }
}
