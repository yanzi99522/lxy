package a0707;

/**
 * @author lxy
 */
public class Main3 {//把s中所有非0~9的字符替换为空串
    static String s = "312jdhkahd8hf9231";
    public static void main(String[] args) {
        String a = s.replaceAll("[^0-9]", "");
        System.out.println(a);
    }
}
