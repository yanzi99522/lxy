package stringtest;

public class Replace {
    public static void main(String[] args) {
      //indexOf()：返回指定字符的索引。
      //charAt()：返回指定索引处的字符。
      //replace()：字符串替换。
      //trim()：去除字符串两端空白。
      //split()：分割字符串，返回一个分割后的字符串数组。
      //getBytes()：返回字符串的 byte 类型数组。
      //length()：返回字符串长度。
      //toLowerCase()：将字符串转成小写字母。
      //toUpperCase()：将字符串转成大写字符。
      //substring()：截取字符串。
      //equals()：字符串比较。
        String s = "a b DDD TTT EEEc d e";
       String a= s.trim();
      int b=s.indexOf("c");
        char c = s.charAt(3);
        String r=s.replace("a","m");
        String t=s.trim();
        String []p=s.split(s);
        byte b1[]=s.getBytes();
        int l=s.length();
        String x=s.toLowerCase();
        String X=s.toUpperCase();
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(t);
        System.out.println(p);
        System.out.println(b1);
        System.out.println(l);
        System.out.println(x);
        System.out.println(X);
    }
}
