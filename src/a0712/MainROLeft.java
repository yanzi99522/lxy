package a0712;

/**
 * @author lxy
 */
public class MainROLeft {
    public static void main(String[] args) {

        String str = "abcXYZdef";
        int n = 3;
        int len = str.length();
        StringBuffer stringBuffer = new StringBuffer();
        if (len > 3) {
            for (int i = n; i < len; i++) {
                stringBuffer.append(str.charAt(i));
            }
            for (int j = len - 1; j > len - n - 1; j--) {
                stringBuffer.append(str.charAt(len - 1 - j));
            }
            String s = stringBuffer.toString();
            System.out.println(s);
        }else {
            System.out.println("");
        }
    }
}