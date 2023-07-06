package searching;

import java.util.Scanner;

public class twopointer {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter a size");
        int num=s.nextInt();  
        System.out.println("enter a target element of array");
        int target=s.nextInt();
        
        System.out.println("enter a elements");
        int arr[]=new int[num];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=s.nextInt();
        }
        System.out.println((twopointersearch(arr,target)==true)?"yes":"No");
    }
    public static boolean twopointersearch(int arr[],int search)
    {
        // 2 5 8 12 30
        // search=17
        //output yes or no
        int low=0,high=arr.length-1;
        while(low<high)
        {
            if(arr[low]+arr[high]==search)
            {
                return true;
            }
            else if(arr[low]+arr[high]>search)
            {
                high--;
            }
            else{
                low++;
            }
        }
       
    return false ;
    }
}
