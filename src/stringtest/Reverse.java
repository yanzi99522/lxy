package stringtest;

public class Reverse {
    public static void main(String[] args) {
        StringBuffer stringBuffer=new StringBuffer();
        stringBuffer.append("abcdefg");
        System.out.println(stringBuffer.reverse());
        //StringBuffer reverse

        //StringBuilder reverse
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("aaabbccddd");
        System.out.println(stringBuilder.reverse());
    }
}
