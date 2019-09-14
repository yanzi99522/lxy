package aaaaniu.ke.wang.eleven;

public class duichenpingfangshuMain {
    static int duichen(int n){
        if (n<10){
            return 1;
        }
        if (n<100){
            int a=n%10;
            int b=n/10;
            if (a==b){
                return 1;
            }else {
                return 0;
            }
        }else {
            int a=n%10;
            int b=n/100;
            if (a==b){
                return 1;
            }else {
                return 0;
            }
        }
    }
    public static void main(String[] args) {

        for (int i=0;i<=256;i++){
           int p= duichen(i*i);
           if (p>0){
               System.out.println(i);
           }
        }
    }
}
