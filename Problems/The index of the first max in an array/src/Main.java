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
        int pos = 0;
        int max = 0;

        for (int i = 0; i < len; i++) {
            if (arr[i] > max) {
                max = arr[i];
                pos = i;
            }
        }
        System.out.println(pos);
    }
}