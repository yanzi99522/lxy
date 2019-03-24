package stringtest;

public class Replace {
    public static void main(String[] args) {
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
