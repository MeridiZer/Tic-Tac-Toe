import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int len = scan.nextInt();
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = scan.nextInt();
        }
        int n = scan.nextInt();
        int m = scan.nextInt();
        boolean flag = true;

        for (int i = 0; i < len - 1; i++) {
            if (arr[i] == n && arr[i + 1] == m || arr[i] == m && arr[i + 1] == n) {
                flag = false;
            }
        }
        System.out.println(flag);
    }
}