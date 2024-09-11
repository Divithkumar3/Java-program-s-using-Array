import java.util.*;
public class frequent {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Most frequent element:"+findmostfrequent(arr));
    }

    public static int findmostfrequent(int[] arr){
        int maxfrequency=0;
        int mostfrequent=arr[0];
        for(int i=0;i<arr.length;i++){
            int frequency=0;
            for(int j=0;j<arr.length;j++){
                if(arr[i]==arr[j]){
                frequency++;
                }
            }
            if(frequency>maxfrequency){
                maxfrequency=mostfrequent;
                mostfrequent=arr[i];
            }
            
        }
        return mostfrequent;
    }

}

