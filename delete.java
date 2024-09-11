import java.util.Scanner;

public class delete {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the index of the element you want to delete: ");
        int index = sc.nextInt();
        int[] newarr = new int[arr.length - 1];
        System.arraycopy(arr, 0, newarr, 0, index);
        System.arraycopy(arr, index + 1, newarr, index, arr.length - index - 1);
        System.out.print("Array after deleted: ");
        for (int i = 0; i < newarr.length; i++) {
            System.out.print(newarr[i] + " ");
        }
    }
}
