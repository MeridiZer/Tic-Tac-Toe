import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scan = new Scanner(System.in);

        String[] str = scan.nextLine().split(" ");
        boolean flag = true;

        for (int i = 1; i < str.length; i++) {
            flag = str[i - 1].compareTo(str[i]) <= 0;
            if (!flag) {
                break;
            }
        }

        System.out.println(flag);

    }
}