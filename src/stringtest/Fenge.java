package stringtest;

public class Fenge {
    public static void main(String[] args) {
        String result="单身贵族||白领||高帅富||土豪||IT";
        String[] split = result.split("\\|\\|");
        System.out.println(split);

    }
}
