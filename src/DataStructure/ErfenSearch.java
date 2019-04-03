package DataStructure;

import java.util.Scanner;

public class ErfenSearch {
    static int find(int[] list, int number) {

        int low = 0;
        int high = list.length - 1;
        while (low<=high){
            int mid = (low + high) / 2;
            if (list[mid]==number){
                return mid;
            }
            else if (list[mid]<number){
                low=mid+1;
            }
            else {
                high=mid-1;
            }
        }
        System.out.println("没有找到该数字");
        return -1;

    }




        public static void main (String[]args){
            int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
            System.out.println("请输入要查找的一个数字：");
            Scanner in = new Scanner(System.in);
            int b = in.nextInt();
            int c=find(a, b);
            System.out.println("要查找的数字在数组中，位置是："+c);

        }
    }


