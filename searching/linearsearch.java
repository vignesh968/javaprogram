import java.util.*;
public class linearsearch {
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
        System.out.println( linearsearcharr(arr,target));
       
    }
    public static int linearsearcharr(int arr[],int target)
{
    for(int i=0;i<arr.length;i++)
    {
        if(arr[i]==target)
        {
            return i;
        }
    }
    return -1;
}

}
