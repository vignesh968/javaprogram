package searching;
//count 1s by binary search
import java.util.Scanner;

public class count1s {
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
int y=binarysearcharr(arr);
System.out.println(y); 
    
}
    public static int binarysearcharr(int arr[])
    {
        int low=0,high=arr.length-1;
        int n=arr.length;
        while(low<=high)
        {
            int mid=low+high/2;
            if(arr[mid]==0)
            {
                low=mid+1;
            }
            else{
                if(mid==0|| arr[mid-1]!=arr[mid])
                {
                    return n-mid;
                }
                else{
                    high=mid-1;
                }
            }
        }
        return -1;
    }       
}

