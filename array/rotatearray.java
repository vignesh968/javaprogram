import java.util.Arrays;
import java.util.Scanner;
//Implementation of reversal algothim for the left rotation of an array
public class rotatearray {
       public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter a size of array");
        int num=s.nextInt();
        System.out.println("enter a rotate number");
        int r=s.nextInt();
        System.out.println("enter a array elements");
        int arr[]=new int[num];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=s.nextInt();
        }
int result[]=rotatearrayarr(arr,r);
       System.out.println(Arrays.toString(result));
    }
    public static int [] rotatearrayarr(int arr[],int r)
    {
        while(r!=0)
        {
            int t=arr[0];
            for(int i=1;i<arr.length;i++)
            {
                arr[i-1]=arr[i];
            }
            arr[arr.length-1]=t;
            r--;
        }
        return  arr;
    }

}
