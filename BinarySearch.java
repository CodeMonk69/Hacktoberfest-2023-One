/*  Binary Search using Divide and conquer / recursion [ O(log(n))  ] */
package devide_and_conquer;

import java.util.*;
import java.lang.*;
import java.io.*;

public class BinarySearch {
    static void printMessage (String message, boolean isNewLine) {
        if(isNewLine) {
            System.out.println(message);
        } else {
            System.out.print(message);
        }
    }

    static int BS(int[] arr, int start , int end, int target)
    {
        if(start==end) {
            return (arr[end]==target) ? start: -1;
        }
        else if(start>end) {
            return -1;
        } else {
            int mid=start+((end-start)/2);
            if(arr[mid]==target) {
                return mid;
            } else if(arr[mid]>target) {
                return BS(arr,start,mid-1,target);
            } else {
                return BS(arr,mid+1,end,target);
            }
        }
    }
    
    static Scanner sc=new Scanner(System.in);
    public static void main (String args[])
    {   
        printMessage("Enter Size of array = ",true);
        int n=sc.nextInt();
        int [] arr= new int[n];
        printMessage("Now Enter each element one by one :- ",true);

        for(int i=0;i<n;i++) {
            arr[i]=sc.nextInt();
        }
        printMessage("Enter the search element : ",true);
        
        int target= sc.nextInt();
        System.out.println(BS(arr,0,n-1,target)); // log(n)
        
    }
}
