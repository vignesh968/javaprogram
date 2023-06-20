import java.util.Arrays;
import java.util.Scanner;

public class separate {
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
       separatearr(arr);
    }
    public static void separatearr(int arr[])
    {
//         int c=0;
// for(int i=0;i<arr.length;i++)
// {
//     if(arr[i]==0)
//     {
//         c++;
//     }

// }
// for(int i=0;i<arr.length;i++)
// {
//     if(i<=c)
//     {
//         System.out.print(0+" ");
//     }
//     else{
//         System.out.print(1+" ");
//     }
// }

int left=0,right=arr.length-1;
while(left<right)
{
    while(arr[left]==0 && left<right)
    {
        left++;
    }
    while(arr[right]==1 && right>left)
    {
        right--;
    }
    if(left<right)
    {
        arr[left]=0;
        arr[right]=1;
    }
}
System.out.println(Arrays.toString(arr));
    }
}
