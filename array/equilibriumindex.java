import java.util.Scanner;

public class equilibriumindex
{
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
int equilibriumindex= equilibriumindexarr(arr);
        System.out.println(equilibriumindex);
       
    }
    public static int equilibriumindexarr(int arr[]){

        //time complicity 0(n^2)
        // int sum=0,balancesum=0;
        // for(int i=0;i<arr.length;i++)
        // {
        //     sum+=arr[i];
        //     balancesum=0;
        //     for(int j=i+1;j<arr.length;j++)
        //     {
        //         balancesum+=arr[j];
        //     }
        //     if(sum==balancesum)
        //     {
        //         return i;
        //     }
        // }
        // return -1;

//time complicity 0(n)
        int sumof=0,leftsum=0;
        for(int i=0;i<arr.length;i++)
        {
        sumof+=arr[i];
        }
        for(int i=0;i<arr.length;i++)
        {
            sumof-=arr[i];
            if(leftsum==sumof)
            {
                return i;
            }
            leftsum+=arr[i];
        }
 
 return-1;   }
}