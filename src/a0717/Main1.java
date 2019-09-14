package a0717;

import java.util.Arrays;

/**
 * @author lxy
 */

public class Main1 {

    public static void main(String[] args) {
       int[]prime={2,3,5,7,11};
        System.out.println(prime);
        System.out.println(Arrays.toString(prime));
        double[] doubles = {2, 3, 6, 75.6};
        System.out.println(doubles);
        System.out.println(Arrays.toString(doubles));
        int[]c=prime.clone();
        System.out.println(c);
        System.out.println(Arrays.toString(c));
        System.out.println();

        Main1 main1=new Main1();
        System.out.println(main1.getClass());
    }
}
