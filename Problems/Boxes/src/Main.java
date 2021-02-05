import java.util.Scanner;
import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scan = new Scanner(System.in);

        int[] box1 = new int[3];
        int[] box2 = new int[box1.length];
        int temp1 = 0;
        int temp2 = 0;
        String result;

        for (int i = 0; i < 3; i++) {
            box1[i] = scan.nextInt();
        }
        for (int i = 0; i < 3; i++) {
            box2[i] = scan.nextInt();
        }
        Arrays.sort(box1);
        Arrays.sort(box2);

        for (int i = 0; i < box1.length; i++) {
            temp1 = box1[i] > box2[i] ? temp1 + 1 : temp1;
            temp2 = box1[i] < box2[i] ? temp2 + 1 : temp2;
        }
        result = temp1 == 3 ? "Box 1 > Box 2" : temp2 == 3 ? "Box 1 < Box 2" : "Incompatible";
        System.out.println(result);
    }
}