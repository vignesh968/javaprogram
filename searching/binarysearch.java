package searching;

import java.lang.annotation.Target;
import java.util.Scanner;

public class binarysearch{
    public static void main(String[] args) {
        Scanner s=new Scanner( System.in);
        System.out.println("enter a size");
        int a=s.nextInt();
        System.out.println("enter a target element of array");
            int target=s.nextInt();
        int arr[]=new int [a];
        System.out.println("enter a elements");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=s.nextInt();
        }
      System.out.println(  binarysearcharr(arr,target));
    }
    public static int binarysearcharr(int arr[],int target)
    {
        int low =0,high=arr.length-1;

        while(low<=high)
        {        int middle=(low+high)/2;
           if(arr[middle]==target)
           {
            return middle;
           }
            else if(arr[middle]<target)
            {
                low=middle+1;
            }
            else
            {
                high=middle-1;
            }
        }
        return -1;
    }
}