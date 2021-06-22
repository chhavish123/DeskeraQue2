// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class DeskQue2 {
    public static void main(String[] args) {
       // System.out.println("Hello, World!"); 
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        ReverseArray(arr,0,n-2);
        ReverseArray(arr,0,n-1);
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
    public static void ReverseArray(int[] arr, int i,int j){
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
}