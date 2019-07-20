package a720;

import java.util.Scanner;

/**
 * @author lxy
 */
public class tiao7 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        while (in.hasNext()){
            int n=in.nextInt();
            int count=0;

            for (int i=1;i<=n;i++){
              if (i%7==0){
                  count++;
              }else {
                  int temp=i;
                  while (temp>0){
                      if (temp%10==7){
                          count++;
                          break;
                      }else {
                          temp=temp/10;
                      }
                  }
              }
            }
            System.out.println(count);
        }
    }
}
