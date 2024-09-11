import java.util.Scanner;
public class maxsubarray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      System.out.print("Enter the number of array values");
      int[] arr= new int[n];
      System.out.print("Enter the array");
      for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
      }
      int maxsum=Integer.MIN_VALUE;
      int currentsum=0;
      for(int i=0;i<n;i++){
        currentsum +=arr[i];
        maxsum=Math.max(maxsum,currentsum);
        if(currentsum<0){
            currentsum=0;
        }
      }
      System.out.print("Maximum sum sub array:"+maxsum);
    }
}

