package a0728;

/**
 * @author lxy
 */
public class erjinzhi2 {
    public static void main(String[] args) {
        int m=1999;
        int n=2299;
        String string=Integer.toBinaryString(m^n);
        int length=string.length();
        int num=0;
        for (int i=0;i<length;i++){
            if (string.charAt(i)=='1'){
                num++;
            }
        }
        System.out.println(num);
    }
}
