import java.util.*;
public class search {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter" +n+ "elements");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter target elements");
        int target=sc.nextInt();
        boolean found=false;
        for(int i=0;i<n;i++){
            if(arr[i]==target){
                found=true;
                break;
            }
        }
        if(found){
            System.out.println("Element found");
        }
        else{
            System.out.println("Element not found");
        }
    }}

