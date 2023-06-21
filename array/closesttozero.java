//Given an array A, Find two elements whose sum is closest to zero
//84 69 59 0 -9 -79
//it get sorted -79 -9 0 59 69 
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

import javax.swing.text.html.parser.Element;

public class closesttozero {
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
        sortarr(arr);

     //  System.out.println(Arrays.toString(arr));
sumzeroarr(arr);
    }
     public static int [] sortarr(int arr[])
    {   int m=0;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]>arr[j])
                {
                    m=arr[i];
                    arr[i]=arr[j];
                    arr[j]=m;
                }
            }
        }
        return arr;
    }
    public static void sumzeroarr(int arr[])
    {
        int p=Integer.MAX_VALUE;
        int sum=0, left=0,right=arr.length-1;
        int min_index=0,max_index=arr.length-1;
while(left<right)
{
sum=arr[right]+arr[left];
if(sum<p)
{
    p=sum;
    min_index=right;
    max_index=left;
}
else if(sum<0)
{
    left++;
}
else{
    right--;
}
}
System.out.println("the teo elements whose sumis closest ti "+arr[min_index]+" "+arr[max_index]);
    }
}
