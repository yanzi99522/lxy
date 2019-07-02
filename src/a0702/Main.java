package a0702;

/**
 * @author lxy
 */
public class Main {
    static int yufu(int n){//渔夫捕鱼问题
        int sum=1;
       while (n!=0){
           sum=5*sum+1;
            n--;
        }
       return sum;
    }

    public static void main(String[] args) {
        int s=yufu(5);
        System.out.println(s);
    }
}
