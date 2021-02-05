import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] arr = scan.nextLine().split(" ");
        int rotations = scan.nextInt() % arr.length;

        for (int i = 0; i < rotations; i++) {
            String last = arr[arr.length - 1];
            for (int j = arr.length - 1; j >= 0; j--) {
                arr[j] = arr[(arr.length + j - 1) % arr.length];
            }
            arr[0] = last;
        }

        for (String i : arr) {
            System.out.print(i + " ");
        }
    }
}