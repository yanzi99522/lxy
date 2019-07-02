package a0702;

import java.util.Scanner;

/**
 * @author lxy
 */
public class Maint {
    static int computer,user,last;
    static void Huochai() {
        while (true) {
            System.out.println("目前火柴总数： " + last);
            System.out.println("用户取火柴数量：");
            Scanner in=new Scanner(System.in);
            int user=in.nextInt();
            if (user<1||user>4||user>last){
                System.out.println("你违规了，取火柴数应该是1`~4");
                continue;
            }
            last=last-user;
            if (last==0){
                System.out.println("用户取了最后一个火柴，所以计算机赢了！");
                break;
            }else {
                computer=5-user;
                last=last-computer;
                System.out.println("计算机取火柴数量："+computer);
            }if (last==0){
                System.out.println("计算机取了最后一根火柴，用户赢了");
                break;
            }
        }
    }

    public static void main(String[] args) {
        int num;
        System.out.println("请先输入火柴的总数量：");
        Scanner in=new Scanner(System.in);
        num=in.nextInt();
        System.out.println("火柴的总数量是：" + num);
        last=num;
        Huochai();
    }
}
