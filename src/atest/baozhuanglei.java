package atest;

public class baozhuanglei {
    public static void main(String[] args) {
        Integer objINT = new Integer(80);
        Double objDOUBLE=new Double("80.0");
        Float objFLOAT=new Float("80.2");
        Long objLONG=new Long(822);
        long longvar=objINT.longValue();
        int intvar=objDOUBLE.intValue();
        System.out.println(longvar);
        System.out.println(intvar);
        String s1=Integer.toString(100);
        String s2=Integer.toString(100,16);
        System.out.println(s1);
        System.out.println(s2);
    }
}
