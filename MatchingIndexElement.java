/*  find the index of array having n distinct element where arr[i]=index of array. */
package devide_and_conquer;
import java.util.*;
import java.lang.*;

public class MatchingIndexElement {
    
    static int searchMatchingIndex(int[] arr, int n)  // Binary search O(log(n)
    {
        int start=0;
        int end=n-1;
        while(start<end) {
            int mid=start+((end-start)/2);
            if(arr[mid]==mid) {
                return mid;
            } else {
                if(arr[mid]>mid) {
                    end=mid-1;
                } else {
                    start=start+1;
                }
            }
        }
        return -1;
    }
    
    static Scanner sc=new Scanner(System.in);
    public static void main (String args[])
    {
        System.out.println("Enter Size of array = ");
        int n=sc.nextInt();
        int [] arr= new int[n];
        System.out.println("Now Enter each element one by one :- ");
        
        for(int i=0;i<n;i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println("\n"+searchMatchingIndex(arr,n)); // log(n)
    }
}
