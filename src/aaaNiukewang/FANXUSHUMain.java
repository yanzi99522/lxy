package aaaNiukewang;

public class FANXUSHUMain {
    public static void main(String[] args) {
        for (int i=1;i<10;i++){
            for (int j=0;j<10;j++){
                for (int k=0;k<10;k++){
                    for (int m=0;m<10;m++){
                        if ((1000*i+100*j+10*k+m)*9==(1000*m+100*k+10*j+i)){
                            System.out.println((1000*i+100*j+10*k+m));
                        }
                    }
                }
            }
        }
    }
}
