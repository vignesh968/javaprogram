//Given an array and an integer k, 
//find the maximum for each and every contiguous sub array of size k  in java

import java.util.Scanner;

public class maxvalueofsubarray {
       public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter a size of array");
        int num=s.nextInt();
        System.out.println("enter a sub array  up to k");
        int k=s.nextInt();
        System.out.println("enter a array elements");
        int arr[]=new int[num];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=s.nextInt();
        }
maxvalueofsubarrayarr(arr,k);
       
    }
    public static void maxvalueofsubarrayarr(int arr[],int k)
    {
        int n=arr.length;
       for(int i=0;i<n-k;i++)
{
    int max=arr[i];
    for(int j=i+1;j<i+k;j++)
    {
        if(arr[j]>max)
        {
            max=arr[j];
        }
    }
    System.out.println(max);
}
    }
}
