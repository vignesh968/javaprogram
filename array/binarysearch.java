    import java.util.Scanner;

    public class binarysearch {
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
            System.out.println( binarysearcharr(arr,target));
        
        }
        public static int binarysearcharr(int arr[],int target)
        {
            int low=0,high=arr.length-1;
    while(low<=high)
    {
        int mid=(low+high)/2;
        if(arr[mid]==target)
        {
            return mid;
        }
        else if(arr[mid]<target)
        {
            low=mid+1;
        }
        else{
            high=mid-1;
        }
    }
    return -1;
            }
    }
