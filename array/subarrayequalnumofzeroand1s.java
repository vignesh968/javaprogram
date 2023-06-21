import java.util.*;
//52.Find the largest sub array with equal number of 0's and 1's
//input 0 1 1 1 0 1 1 0
//output
// 0 1 1 0
public class subarrayequalnumofzeroand1s {
    
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
    subarrayequalnumofzeroand1sarr(arr);
    }
   public static void subarrayequalnumofzeroand1sarr(int arr[])
    {
        int positioni=0,positionj=0;
        int largestsub=0,zero=0,one=0;
        for(int i=0;i<arr.length;i++)
        {
            zero=0;
            one=0;
           
            for(int j=i;j<arr.length;j++)
            {
                if(arr[j]==0)
            {
                zero++;
            }
            if(arr[j]==1)      {
                one++;
            }
          
            
            if(zero==one )
            {
                if(zero>largestsub)
                {   positioni=i;
                    positionj=j;
                    largestsub=zero;
                }
            }
        }
        }
        for(int i=positioni;i<=positionj;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}


