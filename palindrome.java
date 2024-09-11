import java.util.Scanner;
public class palindrome {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER HOW MANY DIGITS: ");
        int n=sc.nextInt();
        System.out.println("ENTER"+n+"Arrays:");
        int[] arr= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        boolean checkpalindrome=true;
        for(int i=0;i<n/2;i++){
           if(arr[i]!=arr[n-i-1]){
            checkpalindrome=false;
            break;
           }
        }
        System.out.print(checkpalindrome?"Array is a Palindrome" : "Array is not a Palindrome");
    }
}
