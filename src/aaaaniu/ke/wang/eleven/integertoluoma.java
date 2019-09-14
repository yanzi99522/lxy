package aaaaniu.ke.wang.eleven;

public class integertoluoma {
    public String intToRoman(int num){
        int temp;
        String ss="";
        while (num>0){
            temp=num%10;
            num=num/10;
            ss=temp+ss;
        }
        int l=ss.length();
            char[] A=ss.toCharArray();
        String[] s=new String[A.length];
        for (int i=0;i<l;i++){
//            String[] s=new String[A.length];
            int n=A[i];

            if (n==1){
                s[i]="I";
//                System.out.print("I");
            }
            if (n==2){
                s[i]="II";
//                System.out.print("II");
            }
            if (n==3){
                s[i]="III";
//                System.out.print("III");
            }
            if (n==4){
                s[i]="IV";
//                System.out.print("IV");
            }
            if (n==5){
                s[i]="V";
//                System.out.print("V");
            }
            if (n==6){
                s[i]="VI";
//                System.out.print("VI");
            }
            if (n==7){
                s[i]="VII";
//                System.out.print("VII");
            }
            if (n==8){
                s[i]="VIII";
//                System.out.print("VIII");
            }
            if (n==9){
                s[i]="IX";
//                System.out.print("IX");
            }
            if (n==10){
                s[i]="X";
//                System.out.print("X");
            }
            if (n==11){
                s[i]="XI";
//                System.out.print("XI");
            }
            if (n==12){
                s[i]="XII";
//                System.out.print("XII");
            }
        }
        String str="";
        for (int i=0;i<A.length;i++){
           String t=A[i]+"";
           str=str+t;

        }
        return str;
    }
    }

