package aaaaniu.ke.wang.datastructure;

public class fenshu {
    public static void main(String[] args) {
        double s=0;
        int i=0;
        do {
            s=s+1.0/(2*i+1);
            i++;
        }while (1.0/(2*i+1)>=0.00001);
        System.out.println(s);
        System.out.println(i);

    }
}
