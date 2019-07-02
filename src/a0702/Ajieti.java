package a0702;

/**
 * @author lxy
 */
public class Ajieti {//爱因斯坦阶梯问题求解
    public static void main(String[] args) {
        int n;
        for (int i=1;i<=100;i++){
            n=7*i;
            if ((n%2==1)&&(n%3==2)&&(n%5==4)&&(n%6)==5){
                System.out.println(n);
                break;
            }
        }
    }
}
