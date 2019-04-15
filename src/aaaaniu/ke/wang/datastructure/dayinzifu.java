package aaaaniu.ke.wang.datastructure;

public class dayinzifu {
    public static void main(String[] args) {

        for (int i=32;i<127;i++){
           String c="";
            c=i<100?("0"+i):(""+i);

            System.out.print(c+"="+(char)i+" ");
            if ((i-31)%8==0){
                System.out.println();
            }
        }
    }
}
