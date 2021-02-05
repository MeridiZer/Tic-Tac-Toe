import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scan = new Scanner(System.in);
        int len = scan.nextInt();
        int[] a = new int[len];
        for (int i = 0; i < a.length; ++i) {
            a[i] = scan.nextInt();
        }
        int last = a[a.length - 1];

        for (int i = a.length - 1; i > 0; --i) {
            a[i] = a[(a.length - 1 + i) % a.length];
        }
        a[0] = last;
        for (int i : a) {
            System.out.print(i + " ");
        }
    }
}