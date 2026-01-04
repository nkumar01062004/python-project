import java.util.Scanner;

public class FindPosition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter element: ");
        int key = sc.nextInt();

        int position = -1;

        for (int i = 0; i < n; i++) {
            if (arr[i] == key) {
                position = i + 1; // position (not index)
                break;
            }
        }

        if (position != -1) {
            System.out.println("Position: " + position);
        } else {
            System.out.println("Element not found");
        }
    }
}