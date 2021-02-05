import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scan = new Scanner(System.in);
        
        int len = scan.nextInt();
        boolean flag = false;
        
        int[] arr = new int[len];
        for (int i = 0; i < arr.length; ++i) {
            arr[i] = scan.nextInt();
        }
        
        int n = scan.nextInt();
        int m = scan.nextInt();
        
        for (int i = 0; i < arr.length - 1; ++i) {
            if (arr[i] == n && arr[i + 1] == m || arr[i] == m && arr[i + 1] == n) {
                flag = true;
                break;
            }
        }
        
        System.out.println(flag);
    }
}
