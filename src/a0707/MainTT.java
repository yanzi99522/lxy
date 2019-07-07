package a0707;

/**
 * @author lxy
 */
public class MainTT {//约瑟夫环问题

    public static void main(String[] args) {
        Boolean[] useha=new Boolean[30];
        for (int i=0;i<useha.length;i++){
            useha[i]=true;
        }

        int leftcount=useha.length;
        int countnum=0;
        int index=0;
        while (leftcount>1){
            countnum++;
            if (countnum==9){
                countnum=0;
                useha[index]=false;
                leftcount--;
            }
            index++;
            if (index==useha.length){
                index=0;
            }
            for (int i=0;i<useha.length;i++){
                System.out.println(i+"="+useha[i]+" ");
            }
        }
    }
}
