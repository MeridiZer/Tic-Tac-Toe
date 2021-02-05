import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner scan = new Scanner(System.in);
        
        int len = scan.nextInt();
        int[] companies = new int[len];
        int[] taxes = new int[len];
        int top = 0;
        float temp = 0;

        for (int i = 0; i < len; i++) {
            companies[i] = scan.nextInt();
        }
        for (int i = 0; i < len; i++) {
            taxes[i] = scan.nextInt();
        }

        for (int i = 0; i < len; i++) {
            if (taxes[i] > 0) {
                if ((float) companies[i] / 100 * taxes[i] >= temp) {
                    top = i + 1;
                }
                temp = (float) companies[i] / 100 * taxes[i];
            }
        }
        System.out.println(top);
    }
}