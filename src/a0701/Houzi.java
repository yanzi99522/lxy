package a0701;

/**
 * @author lxy
 */
public class Houzi {
    static int TAO(int n){
        if (n==1){
            return 1;
        }else {
            return 2*(TAO(n-1)+1);
        }
    }

    public static void main(String[] args) {
        int n=TAO(10);//10天
        System.out.println(n);//桃子数
    }
}
