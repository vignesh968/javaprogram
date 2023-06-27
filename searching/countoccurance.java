package searching;

import java.lang.annotation.Target;
import java.util.Scanner;

public class countoccurance {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter a size of array");
        int num=s.nextInt();
         System.out.println("enter a target element of array");
            int target=s.nextInt();      
        System.out.println("enter a array elements");
        int arr[]=new int[num];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=s.nextInt();
        }
int u=countoccurancearr(arr,target);
System.out.println(u);    
}
    public static int countoccurancearr(int arr[],int target)
    {
        int first=firstoccur(arr,target);
        if(first==-1)
        {
            return 0;
        }
        else
        {
            return lastoccur(arr,target)-first+1;
        }
    }
    public static int firstoccur(int[] arr,int target)
    {

            for(int i=0;i<arr.length;i++)
            {
                if(arr[i]==target)
                {
                    return i;
                }
            }
            return -1;        
    } public static int lastoccur(int[] arr,int target)
    {

            for(int i=arr.length-1;i>=0;i--)
            {
                if(arr[i]==target)
                {
                    return i;
                }
            }
            return -1;        
    }
}
