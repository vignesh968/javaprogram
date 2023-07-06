package searching;

import java.util.Arrays;
import java.util.Scanner;

public class mediantwosorted{
public static void main(String[] args) {
       Scanner s=new Scanner(System.in);
        System.out.println("enter a size of 1st array");
        int num1=s.nextInt();  
     
        System.out.println("enter a elements of 1st array");
        int arr1[]=new int[num1];
        for(int i=0;i<arr1.length;i++)
        {
            arr1[i]=s.nextInt();
        }
        System.out.println("enter a size of 1st array");
        int num2=s.nextInt();  
     
        System.out.println("enter a elements of 1st array");
        int arr2[]=new int[num2];
        for(int i=0;i<arr2.length;i++)
        {
            arr2[i]=s.nextInt();
        }
        mediantwosortedsearch(arr1,arr2);
}
public static int mediantwosortedsearch(int arr1[],int arr2[])
{
    int temp[]=new int[arr1.length +arr2.length];
    int y=0;
    if(arr1[0]>arr2[0])
{
    for(int i=0;i<temp.length;i++)
    {
        for(int j=0;j<arr1.length;j++)
        {
            temp[i]=arr1[j];
            i++;
        }
        for(int j=0;j<arr2.length;j++)
        {
            temp[i]=arr2[j];
            i++;
        }
         System.out.println(Arrays.toString(temp));
    }
}
    return 0;
}
}