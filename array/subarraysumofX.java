import java.util.Arrays;
import java.util.Scanner;
//47.Find the sub array with given sum X 
//5 4 6 7 9 8 3 1 2
// x=21
//output
// 9 8 3 1
//9+ 8 +3 +1=21
public class subarraysumofX {
       public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter a size of array");
        int num=s.nextInt();
        System.out.println("enter a sum of subarray equals");
        int subarray=s.nextInt();
        System.out.println("enter a array elements");
        int arr[]=new int[num];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=s.nextInt();
        }
        System.out.println(Arrays.toString(arr));
subarraysumofXarr(arr,subarray);
       
    }
    public static void subarraysumofXarr(int arr[],int subarray)
    {int sum=0,start=0,end=0;
        for(int i=0;i<arr.length;i++)
        {sum=0;
            for(int j=i;j<arr.length;j++)
            {
               sum+=arr[j];
               if(subarray==sum)
               {
                start=i;
                end=j;
                break;
               } 
            }
        }
        int sumoff=0;
        for(int i=start;i<=end;i++)
        {
            sumoff+=arr[i];
            System.out.println(arr[i]);
        }
        System.out.println("sum is: "+sumoff);
    }
}
