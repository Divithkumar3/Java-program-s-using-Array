import java.util.Scanner;
public class duplicate {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for (int i = 0; i < arr[i]; i++) {
            for (int j = i + 1; j < arr[i]; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println("Duplicate element is " + arr[i]);
                }
            }
    }
}
}
