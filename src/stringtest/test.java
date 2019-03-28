package stringtest;

public class test {
    public static void main(String[] args) {
        String s="   hello,t  est,*    wo  rld  ";
        System.out.println(s.trim());
        char[] charsArr=s.toCharArray();
        System.out.println(charsArr);
        byte[] bytesArr=s.getBytes();
        System.out.println(charsArr);
            String[] stringsArr=s.split("/,");
        System.out.println();
        System.out.println(s.contains("lloa"));
        System.out.println(s.endsWith("ld"));
        System.out.println(s.length());
        System.out.println(s.charAt(8));
        System.out.println(s.indexOf("e"));
        System.out.println(s.substring(3,9));
    }
}
