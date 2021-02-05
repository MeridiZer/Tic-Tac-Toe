import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scan = new Scanner(System.in);
        int len = scan.nextInt();
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = scan.nextInt();
        }
        int max = 0;

        for (int i = 0; i < len - 1; i++) {
            int cur = arr[i] * arr[i + 1];
            if (cur > max) {
                max = cur;
            }
        }
        System.out.println(max);
    }
}