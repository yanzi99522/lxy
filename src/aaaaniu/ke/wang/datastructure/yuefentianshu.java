package aaaaniu.ke.wang.datastructure;

import java.util.Scanner;

public class yuefentianshu {
    public void showDays(int iMonth) {
        int iDays = 0;
        switch (iMonth) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                iDays = 31;
                break;
            case 2:
                iDays = 28;
                break;
            default:
                iDays = 30;
        }
        System.out.println(iDays);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int n = in.nextInt();
            yuefentianshu y = new yuefentianshu();
            y.showDays(n);

        }
    }
}