package aaaaniu.ke.wang.a420;

import java.util.Scanner;

public class zhongshu {
        static int max(int a,int b){
            if (a>b){
                return a;
            }else {
                return b;
            }
        }
        public static void main(String[] args) {
            Scanner in=new Scanner(System.in);
            int[] number=new int[20];
            for (int i=0;i<20;i++){
                number[i]=in.nextInt();
            }
            int c1=0,c2=0,c3=0,c4=0,c5=0,c6=0,c7=0,c8=0,c9=0,c10=0;
            for (int i=0;i<20;i++){
                switch (number[i]){
                    case 1:
                        c1++;
                        break;
                    case 2:c2++;break;
                    case 3:c3++;break;
                    case 4:c4++;break;
                    case 5:c5++;break;
                    case 6:c6++;break;
                    case 7:c7++;break;
                    case 8:c8++;break;
                    case 9:c9++;break;
                    case 10:c10++;break;


                }

            }
            int m=max(max(max(max(max(max(max(max(max(c10,c9),c8),c7),c6),c5),c4),c3),c2),c1);
            if(c1==m&&(c2==m||c4==m||c10==m)){
                System.out.println("1");
            }else if(c5==m&&c6==m){
                System.out.println("5");
            }else if(c7==m&&c9==m){
                System.out.println("7");
            }else if(c2==m&&c3==m){
                System.out.println("2");
            }else if(c3==m&&c7==m){
                System.out.println("3");
            }


            else{
                if (c1==m){
                    System.out.println("1");
                }
                if (c2==m){
                    System.out.println("2");
                }
                if (c3==m){
                    System.out.println("3");
                }
                if (c4==m){
                    System.out.println("4");
                }
                if (c5==m){
                    System.out.println("5");
                }
                if (c6==m){
                    System.out.println("6");
                }
                if (c7==m){
                    System.out.println("7");
                }
                if (c8==m){
                    System.out.println("8");
                }
                if (c9==m){
                    System.out.println("9");
                }
                if (c10==m){
                    System.out.println("10");
                }
            }
        }
    }
