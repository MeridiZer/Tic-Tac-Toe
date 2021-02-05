import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scan = new Scanner(System.in);
        int len = scan.nextInt();
        int[] arr = new int[len];
        int sum = 0;
        for (int i = 0; i < len; i++) {
            arr[i] = scan.nextInt();
        }
        for (int i : arr) {
            sum += i;
        }
        System.out.print(sum);
    }
}