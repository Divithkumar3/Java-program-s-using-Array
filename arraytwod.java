import java.util.*;
public class arraytwod {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the array1 digits:");
        int n1=sc.nextInt();
        System.out.print("Enter the array1:");
        int[] arr1=new int[n1];
        for(int i=0;i<n1;i++){
            arr1[i]=sc.nextInt();
        }
        System.out.print("Enter the array2 digits:");
        int n2=sc.nextInt();
        System.out.print("Enter the array2:");
        int[] arr2=new int[n2];
        for(int i=0;i<n2;i++){
            arr2[i]=sc.nextInt();
        }
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr2.length;j++){
                if(arr1[i]==arr2[j]){
                    System.out.print("Common element is:"+arr1[i]+" ");
                    arr2[j] = Integer.MIN_VALUE;
                    break;
                }
            }
        }
        
}
}
