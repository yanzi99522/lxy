package stringtest;

public class Hashcode {
    public static void main(String[] args) {
       //hashCode()相同，equals()不一定true
        String str1="通话";
        String str2="重地";
        System.out.println(String.format("str1:%d|str2:%d", str1.hashCode(), str2.hashCode()));
        System.out.println(str1.equals(str2));
    }
}
