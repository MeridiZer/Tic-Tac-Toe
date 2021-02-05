import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner scan = new Scanner(System.in);
        String[] style = new String[4];
        for (int i = 0; i < 4; i++) {
            style[i] = scan.next();
        }
        boolean pretty = true;

        for (int i = 0; i < 3 && pretty; i++) {
            for (int j = 0; j < 3 && pretty; j++) {
                if (style[i].charAt(j) == style[i].charAt(j + 1)) {
                    pretty = !style[i].substring(j, j + 2).equals(style[i + 1].substring(j, j + 2));
                }
            }
        }

        if (pretty) {
            System.out.print("YES");
        } else {
            System.out.print("NO");
        }
    }
}