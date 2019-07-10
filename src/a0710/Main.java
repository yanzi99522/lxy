package a0710;

/**
 * @author lxy
 */
public class Main {
    public static void main(String[] args) {
        for (int i=0;i<5;i++){
            for (int j=0;j<5;j++){
                if (j>=2) {
                    break;
                }
                System.out.println(i);
            }
        }
        System.out.println("break");
    }
}
