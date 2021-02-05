import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scan = new Scanner(System.in);

        int len = scan.nextInt();
        int[] arr = new int[len];
        for (int i = 0; i < arr.length; ++i) {
            arr[i] = scan.nextInt();
        }
        int seq = 1;
        if (arr.length < 1) {
            seq = 0;
        }
        int seqMax = seq;

        for (int i = 1; i < arr.length; ++i) {
            if (arr[i] > arr[i - 1]) {
                seq++;
                if (seq >= seqMax) {
                    seqMax = seq;
                }
            } else {
                if (seq >= seqMax) {
                    seqMax = seq;
                }
                seq = 1;
            }
        }

        System.out.println(seqMax);
    }
}
