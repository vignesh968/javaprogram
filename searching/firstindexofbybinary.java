package searching;

import java.util.Scanner;

public class firstindexofbybinary {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter a size of array");
        int num = s.nextInt();
        System.out.println("enter a target element of array");
        int target = s.nextInt();
        System.out.println("enter a array elements");
        int arr[] = new int[num];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }
        int y = firstindexofbybinaryarr(arr, target);
        System.out.println(y);
    }

    public static int firstindexofbybinaryarr(int arr[],int target) 
{
    int low=0,high=arr.length-1;
    while(low<=high)
    {
        int mid=(low+high)/2;
        if(arr[mid]<target)
        {
            low=mid+1; 
        }
        else if(arr[mid]>target)
        {
            high=mid-1;
        }
        else{
            if(mid==0|| arr[mid-1]!=arr[mid])
            {
                return mid;
            }
            else{
                high=mid-1;
        }
    }
}
return-1;
}}