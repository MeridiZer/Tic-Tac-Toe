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
        int n = scan.nextInt();
        int sum = 0;

        for (int i : arr) {
            if (i > n) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}