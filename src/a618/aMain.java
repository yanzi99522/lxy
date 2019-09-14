package a618;

import java.util.Scanner;

/**
 * @author lxy
 */
public class aMain {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int [][]fenshu=new int[n][2];
        for (int i=0;i<n;i++){
            fenshu[i][0]=in.nextInt();
            fenshu[i][1]=in.nextInt();
        }
        for (int i=0;i<n;i++){
            for (int j=0;j<2;j++){
                System.out.print(fenshu[i][j]);
            }
            System.out.println();
        }
        int t,p=0;
        for (int i=0;i<n;i++) {
            for (int j = i + 1; j < n; j++) {
                if (fenshu[i][1] > fenshu[j][1]){
                    t=fenshu[i][0];
                    p=fenshu[i][1];
                    fenshu[i][0]=fenshu[j][0];
                    fenshu[i][1]=fenshu[j][1];
                    fenshu[j][0]=t;
                    fenshu[j][1]=p;
                }
            }
        }
        for (int i=0;i<n;i++){
            for (int j=0;j<2;j++){
                System.out.print(fenshu[i][j]+" ");
            }
            System.out.println();
        }
    }
}
