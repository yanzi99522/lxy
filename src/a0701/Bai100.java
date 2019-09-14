package a0701;

/**
 * @author lxy
 */
public class Bai100 {
    static void Bai(int m,int n){
        int x,y,z;
        for (x=0;x<100;x++){
            for (y=0;y<100;y++){
                z=m-x-y;
                if (z>0&&(5*x+3*y+z/3==100)&&z%3==0){
                    System.out.println("公鸡："+x+"只，母鸡："+y+"只，小鸡："+z+"只");
                }else {

                }
            }
        }
    }
    public static void main(String[] args) {
        int m=100,n=100;
        Bai(m,n);
    }
}
