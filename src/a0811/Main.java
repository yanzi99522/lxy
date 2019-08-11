package a0811;

import java.util.Scanner;

/**
 * @author lxy
 */
public class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int nums[]=new int[n];
        while (in.hasNext()){
            for (int i=0;i<n;i++){
                nums[i]=in.nextInt();
            }
            int temp=0;
            for (int i=0;i<n;i++){
                for (int j=i+1;j<n;j++){
                    if (nums[i]<nums[j]){
                        temp=nums[i];
                        nums[i]=nums[j];
                        nums[j]=temp;

                    }
                }
            }
            int t=0,sum=0;
            for (int i=0;i<n-2;i++){
                t=nums[i]*(i+1);
                sum=sum+t;
            }
            sum=sum+(nums[n-1]+nums[n-2])*(n-1);
            System.out.println(sum);
        }
    }
}
