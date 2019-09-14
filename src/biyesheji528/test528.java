package biyesheji528;

public class test528 {
    public static void main(String[] args) {
        int []number=new int[30];
        for (int i=0;i<30;i++){
            if ((i==0)||(i==1)){
                number[i]=1;
            }else {
                number[i]=number[i-1]+number[i-2];
            }

        }
        System.out.println(number[29]);
    }
}
