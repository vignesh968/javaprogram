import java.util.Scanner;

public class duplicate {
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
        duplicatearr(arr);
    }
    public static void duplicatearr(int arr[])
    {int p=0,d=0,k=0;
        for(int i=0;i<arr.length;i++)
        {
            p=Math.abs(arr[i]);
            if(arr[p]>=0)
            {d=Math.abs(arr[i]);
                arr[d]=-arr[p];

            }
            else
            {
                k=arr[i];
                System.out.println(Math.abs(arr[i]));
            }
        }
    }
    
}
