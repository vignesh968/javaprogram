import java.util.Arrays;
import java.util.Scanner;

public class tripletsum {
     public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter a size of array");
        int num=s.nextInt();
        System.out.println("enter the value to be equal");
        int equal=s.nextInt();
        System.out.println("enter a array elements");
        int arr[]=new int[num];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=s.nextInt();
        }
        Arrays.sort(arr);
        tripletsumarr(arr,equal);
       
    }
    public static void tripletsumarr(int arr[],int equal)
    {
        int trip1=0,trip2=0,trip3=0;
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
         int left=i+1,right=arr.length-1;
         while(left<right)
         {
            sum=arr[i]+arr[left]+arr[right];
            if(sum==equal)
            {
                trip1=arr[i];
                trip2=arr[left];
                trip3=arr[right];
                System.out.println("the sum of "+equal+" is: "+trip1+","+trip2+","+trip3);
                break; 
            }
           else if(sum>equal)
           {
                  right--;
         
           }
           else{
         left++;
           }
         }
         
            
          
        }
        
    }
}
