import java.util.*;
public class array
{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter a size of array");
        int num=s.nextInt();
        int arr[]=new int[num];
        System.out.println("enter a elements");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=s.nextInt();
        }
          for(int i=0;i<arr.length;i++)
        {
           System.out.print( arr[i]+" ");
        }
    }
}