package a0703;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author lxy
 */
public class Main {
    public static void main(String[] args) {
        print();
    }
    public static int[] write(){
        BufferedReader[] bufferedReaders = new BufferedReader[10];
        int n;
        int array[] = new int[10];
        for (int i=0;i<10;i++){
            bufferedReaders[i] = new BufferedReader(new InputStreamReader(System.in));
            do {
                n=1;
                System.out.println("请输入第" + (i + 1) + "个整数：");
                try {
                    array[i] = Integer.parseInt(bufferedReaders[i].readLine());

                }catch (NumberFormatException e){
                    e.printStackTrace();
                }catch (IOException e){
                    e.printStackTrace();
                }
            }while (n==0);
        }
        return array;
    }

    public static void print(){
        int[] ary=write();
        int s;
        System.out.println("你输入的数组是：");
        for (int i=0;i<10;i++){
            System.out.print(ary[i]+" ");
        }
        for (int i=0;i<5;i++){
            s=ary[i];
            ary[i] = ary[9 - i];
            ary[9-i]=s;
        }
        System.out.println("对换后的数组 是：");
        for (int i=0;i<10;i++){
            System.out.print(ary[i]+" ");
        }
        System.out.println();
    }

}
