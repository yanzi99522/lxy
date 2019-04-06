package atest;

public class Hebingshuzu {
    public static void main(String[] args) {
        int[] arry1={1,2,3,4};
        int[] arry2={5,6,7,8};
        int[] arr=new int[arry1.length+arry2.length];
        for (int i=0;i<arr.length;i++){
            if (i<arry1.length){
                arr[i]=arry1[i];
            }else {
                arr[i]=arry2[i-arry1.length];
            }
            System.out.println(arr[i]);
        }
    }
}
