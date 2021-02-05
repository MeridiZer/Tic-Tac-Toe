import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scan = new Scanner(System.in);
        int len = scan.nextInt();
        int[] arr = new int[len];
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < len; i++) {
            arr[i] = scan.nextInt();
        }
        for (int i = 2; i < len; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println(min);
    }
}