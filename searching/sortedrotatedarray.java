package searching;

import java.util.Scanner;

public class sortedrotatedarray {
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
      System.out.println(  sortedrotatedarraynum(arr,target));
    }
    public static int sortedrotatedarraynum(int arr[],int target)
    {
        int low =0,high=arr.length-1;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(arr[mid]==target)
            {
                return mid;
            }
            else if(arr[mid]>arr[high] && arr[mid]>target)
            
            {
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return -1;
    }
}
