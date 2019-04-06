package atest;

public class shuzu2 {
    public static void main(String[] args) {
        int[][] a={ {1,2,3},{4,5,6},{7,8,9}};
        double[][] b=new double[3][3];
        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                b[i][j]=Math.sqrt(a[i][j]);
            }
        }
        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                System.out.print(b[i][j]+" ");
            }
            System.out.println();
        }
    }
}
