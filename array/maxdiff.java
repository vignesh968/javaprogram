// find max diff element and it should be first small number appear and than larger

import java.util.Scanner;

public class maxdiff {
     public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter a size of array");
        int num=s.nextInt();
     //   System.out.println("enter a target element of array");
       // int target=s.nextInt();
        System.out.println("enter a array elements");
        int arr[]=new int[num];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=s.nextInt();
        }
        System.out.println( maxdiffarr(arr));
       
    }
    public static int maxdiffarr(int arr[])
    {
        int k=0,currentdiff=0;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                k=arr[j]-arr[i];
                if(arr[j]>arr[i] && k> currentdiff)
                { 
                    currentdiff=k;
                }
            }
        }
        return currentdiff;
    }
}
