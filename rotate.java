import java.util.Scanner;
public class rotate {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the number of rotations:");
        int rotations = sc.nextInt();
        rotateArray(arr, rotations);
        System.out.println("Rotated array:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

    }   
    public static void rotateArray(int[] arr, int rotations) {
        rotations = rotations % arr.length;
        reverseArray(arr, 0, arr.length - 1);
        reverseArray(arr, 0, rotations - 1);
        reverseArray(arr, rotations, arr.length - 1);
    }

    public static void reverseArray(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    }

