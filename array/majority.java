import java.util.Scanner;
// in unsorted order
public class majority
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

        int maj=majorityarr(arr);
       int ch=checkarr(arr,maj);
       if(ch!=0)
       {
        System.out.println("the majority element is "+maj);
       }
       else{
        System.out.println("no majority element found");
       }
    }
    public static int checkarr(int arr[],int maj)
    {int c=0,m=arr.length/2;
    for(int i=0;i<arr.length;i++)
    {
        if(arr[i]==maj)
        {
            c++;
        }
    }
    if(c>m)
    {
    return 1;
    } 
    return 0;
    }
    public static int majorityarr(int arr[])
    {
        int c=1;
        int majindex=0;
        for(int i=1;i<arr.length;i++)
        {
            if(arr[majindex]==arr[i])
            {
                c++;
            }
            else
            {
                c--;
            }
            if(c==0)
            {
                majindex=i;
                c=1;
            }
        }
        return arr[majindex];
    }
}