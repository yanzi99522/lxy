package aaaNiukewang;

import java.util.Scanner;

public class ChengjiMain {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
        int n = in.nextInt();
        while (n==0){
            return;
        }

            int chengji[] = new int[n];
            for (int i = 0; i < n; i++) {
                chengji[i] = in.nextInt();
            }
            int cha=in.nextInt();
            int count=0;
            for (int i=0;i<n;i++){
                if (cha==chengji[i]){
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
