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
        int triples = 0;
        for (int i = 2; i < len; i++) {
            if (arr[i] - arr[i - 1] == 1 && arr[i] - arr[i - 2] == 2) {
                triples++;
            }
        }
        System.out.println(triples);
    }
}