import java.util.*;
public class minsubarray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter No. of digits:");
        int n=sc.nextInt();
        System.out.println("Enter the array:");
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
       int  minsum=Integer.MAX_VALUE;
       int  currentsum=0;
       for(int i=0;i<n;i++){
        currentsum+=arr[i];
        minsum=Math.min(minsum,currentsum);
        if(currentsum>0){
            currentsum=0;
        }
       }
       System.out.print("Min sub array is:"+ minsum);
    }
}
