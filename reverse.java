import java.util.*;
public class reverse{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the digits:");
        int n=sc.nextInt();
        System.out.print("Enter the Array values");
        int[] arr= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        reversearray(arr);
        System.out.print("Reversed Array is:");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
        public static void reversearray(int[]arr){
        int left=0;
        int right=arr.length-1;
        while(left<right){
            int temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
    
    }
}