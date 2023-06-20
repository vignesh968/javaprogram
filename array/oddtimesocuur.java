
//Implementation of finding the number occurring odd number of times
// in given array

import java.util.Scanner;

public class oddtimesocuur {
        public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter a size of array");
        int num=s.nextInt();
  
        System.out.println("enter a array elements");
        int arr[]=new int[num];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=s.nextInt();
        }
        System.out.println( oddtimesocuurarr(arr));
       
    }
    public static int  oddtimesocuurarr(int arr[])
    {
        int result=0;
        for(int i=0;i<arr.length;i++)
        {
            result=result^arr[i];
        }
  
        return result;
    }
}
