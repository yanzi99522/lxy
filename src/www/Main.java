package www;

import java.util.Scanner;

public class Main {
    static int sushu(int n){
      int bound=(int)Math.sqrt(n)+1;
      for (int i=2;i<=bound;i++){
          if (n%i==0){
              return 0;
          }
      }
      return 1;
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        while (in.hasNext()){
            int n=in.nextInt();
           int t= sushu(n);
//            System.out.println(t);
            int count=0;
            for (int i=2;i<n;i++){
                if (sushu(i)>0){
                    if (i%10==1){
                        count++;
                        if (count>=1){
                            System.out.print(i+" ");
                        }
                    }
                }
            }

        }
    }
}
