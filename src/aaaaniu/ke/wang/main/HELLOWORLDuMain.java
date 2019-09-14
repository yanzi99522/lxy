package aaaaniu.ke.wang.main;

import java.util.Scanner;

public class HELLOWORLDuMain {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        while (in.hasNext()){
            String str=in.nextLine();
            int n=str.length();
            int a=0;
            int b=0;
            if (n/3==0){
                a=n/3;
                b=n+2-2*a;
                char[][] U=new char[a][b+1];
                for (int i=0;i<a;i++){
                    for (int j=0;j<b+1;j++){
                        U[i][j]=' ';

                    }
                }
                for (int i=0;i<a;i++){
                    U[i][0]=str.charAt(i);
                    U[i][b]=str.charAt(n-1-i);
                }
                for (int j=0;j<b+1;j++){
                    U[a-1][j]=str.charAt(a-1+j);
                }
                for (int i=0;i<a;i++){
                    for (int j=0;j<b+1;j++){
//                    if (U[i][j])
                        System.out.print(U[i][j]);
                    }
                    System.out.println();
                }
            }else {
                a = n / 3 + 1;
                b = n + 2 - 2 * a;
                char[][] U=new char[a][b+1];
                for (int i=0;i<a;i++){
                    for (int j=0;j<b+1;j++){
                        U[i][j]=' ';

                    }
                }
                for (int i=0;i<a;i++){
                    U[i][0]=str.charAt(i);
                    U[i][b]=str.charAt(n-1-i);
                }
                for (int j=0;j<b+1;j++){
                    U[a-1][j]=str.charAt(a-1+j);
                }
                for (int i=0;i<a;i++){
                    for (int j=0;j<b+1;j++){
//                    if (U[i][j])
                        System.out.print(U[i][j]);
                    }
                    System.out.println();
                }
            }

//            for (int i=0;i<a;i++){
//                for (int j=0;i<b+1;j++){
//                    U[i][0]=str.charAt(i);
//                    U[i][b]=str.charAt(n-1-i);
//                    U[a-1][j]=str.charAt(a-1+j);
//                }
//            }

        }
    }


}

