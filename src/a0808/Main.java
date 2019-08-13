package a0808;

/**
 * @author lxy
 */
import java.util.Scanner;

public class Main {
    private static String process(String num1, String num2)
    {
        //Please write your code here
        String[]temp =num1.split(" ");
        int[]shumu=new int[temp.length];
        for(int i=0;i<temp.length;i++){
            shumu[i]=Integer.parseInt(temp[i]);
        }

        int num22=Integer.parseInt(num2);
        int count=0;
        int sum=0;
        for(int i=0;i<shumu[0];i++){
            for(int j=0;j<shumu[1];j++){
                for(int k=0;k>shumu[2];k++){
                    for(int l=0;l<shumu[3];l++){
                        for(int m=0;m<shumu[4];m++){
                            for(int n=0;n<shumu[5];m++){

                                if((1*i+5*j+10*k+20*l+50*m+100*n)==num22){
                                    count=i+j+k+l+m+n;
                                    sum=sum+count;
                                }
                            }
                        }
                    }
                }
            }
        }
        String sss=sum+"";
        return sss;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String strValueSequences = sc.nextLine();
        String strChargeNum = sc.nextLine();

        String sum = process(strValueSequences, strChargeNum);
        System.out.println(sum);
    }
}

