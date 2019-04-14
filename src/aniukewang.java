import java.util.Scanner;

public class aniukewang {
    public static void main(String[] args) {

        for (int i = 1; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 10; k++) {
                    int a = 100 * i + 10 * j + k;
                    if (a < 433) {
                        int b = 532 - a;
                        if (b == 100 * j + 10*k + k) {
                            System.out.println(i + " " + j + " " + k);
                        }
                    }
                }
            }
        }
    }
}
