package a0728;

import java.util.Scanner;

/**
 * @author lxy
 */
public class Mains {
    public static void main(String[] args) {
        boolean flag=false;
        Scanner in = new Scanner(System.in);
        String string=in.nextLine();
        int length=string.length();
        char[]zifuc=string.toCharArray();
        int kongge=1;
        for (int i=0;i<string.length();i++){
            if (zifuc[i]==32){
                kongge++;
            }
        }
        char[]t=new char[kongge];
        char[]w=new char[kongge];
        int tj=0;
        t[0]=zifuc[0];
        for (int i=0;i<string.length();i++){
            if (zifuc[i]==32){
                w[tj]=zifuc[i-1];
                tj++;
                t[tj]=zifuc[i+1];
            }
        }
        w[kongge-1]=zifuc[length-1];
//        System.out.println(string);
//        for (int i=0;i<kongge;i++){
//            System.out.print(t[i]);
//        }
//        System.out.println();
//        for (int i=0;i<kongge;i++){
//            System.out.print(w[i]);
//        }
        for (int i=0;i<kongge;i++){
            for (int j=0;j<kongge;j++){
                if (t[i]!=w[j]){

                }else {
                    if (t[1]==w[0]){
                        if (t[2]==w[1]){
                            flag=true;
                        }
                    }
                }
            }
        }
        if (flag){
            System.out.println("true");
        }else {
            System.out.println("false");
        }


    }
}
