package aaaaniu.ke.wang.a420;

import java.util.Scanner;

public class xianglinjizhidian {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int n = in.nextInt();
            int[] shuzu = new int[n];
            for (int i = 0; i < n; i++) {
                shuzu[i] = in.nextInt();
            }
            int min=0;
            int max=0;
            for (int i = 0; i < n; i++) {
                if (i == 0||i==n-1) {
                    if (shuzu[0]<shuzu[1]){
                        System.out.println(i);
                    }
                    if (shuzu[0]>shuzu[1]){
                        System.out.println(i);


                    }
                    if (shuzu[n-1]<shuzu[n-2]) {
                        System.out.println(i);
                    }
                    if (shuzu[n-1]>shuzu[n-2]) {
                        System.out.println(i);
                    }

                } else {
                    if (shuzu[i]< shuzu[i + 1] && shuzu[i]< shuzu[i - 1]) {

//                        System.out.println(shuzu[i]);
                        System.out.println(i);

                    }
                    if (shuzu[i] > shuzu[i + 1] && shuzu[i] > shuzu[i - 1]) {

//                        System.out.println(shuzu[i]);
                        System.out.println(i);

                    }
                }


            }
//            System.out.println(min);
//            System.out.println(max);



        }
    }
}