package atest;

public class zifichuan {
    public static void main(String[] args) {
        String s1=new String();
        String s2=new String("HELLO,WORLD");
        String s3=new String("\u0048");
        s1="hello,world";
        System.out.println(s1+" "+s1);
        System.out.println(s1.startsWith("he"));
        String s11=new String("hello,world");
        System.out.println(s1==s11);
        System.out.println(s1.equals(s11));
        System.out.println("s1=" + s1);
        System.out.println("s2=" + s2);
        System.out.println("s3="+s3);
        System.out.println(s1.compareTo(s2));
        System.out.println(s1.equalsIgnoreCase(s2));
        System.out.println(s1.compareToIgnoreCase(s2));
        char chars[]={'a','b','c','d','e'};
        String s4=new String(chars);
        String s5=new String(chars,1,4);
        System.out.println("s4=" + s4);
        System.out.println("s5=" + s5);

        byte bytes[]={12,34,56,78,97,98,99};
        String s6=new String(bytes);
        System.out.println("s6="+s6);
        System.out.println("s6字符串长度："+s6.length());
    }
}
