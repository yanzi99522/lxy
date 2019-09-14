package a0716;

import java.util.Scanner;

/**
 * @author lxy
 */
public class MainYaghui {
    static void getYANG(int num,int[][]array) {
        int num1;
        int num2;
        int num3;
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i == 0 || j == 0 || j == array[i].length - 1) {
                    array[i][j] = 1;
                } else {
                    if (j - 2 < 0) {
                        num1 = 0;
                    } else {
                        num1 = array[i - 1][j - 2];
                    }

                    if (j - 1 < 0) {
                        num2 = 0;
                    } else {
                        num2 = array[i - 1][j - 1];
                    }

                    if (j >= array[i - 1].length) {
                        num3 = 0;
                    } else {
                        num3 = array[i - 1][j];
                    }
                    array[i][j] = num1 + num2 + num3;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        while (in.hasNext()){
            int num=in.nextInt();
            int[][]array=new int[num][];
            for (int i=0;i<num;i++){
                array[i]=new int[2*i+1];
            }
            getYANG(num,array);
            int i;
            for ( i = 0; i < array[num-1].length; i++) {
                if (array[num-1][i] % 2  == 0) {
                    System.out.println(i+1);
                    break;
                }
            }

            if (i == array[num-1].length ) {
                System.out.println("-1");
            }
        }
        in.close();

        }
    }

