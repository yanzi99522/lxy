package dahaushujujiegou;

/**
 * @author lxy
 */
public class Main {
    public static void main(String[] args) {
        int sum=0;
        for (int i=0;i<20;i++){
            sum+=i;
            if (i%4==0){
                break;
            }
        }
        System.out.println(sum);
    }
}
