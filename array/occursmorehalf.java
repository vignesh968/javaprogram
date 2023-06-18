import java.util.Scanner;

public class occursmorehalf{
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
occursmorehalfarr(arr);
       
    }
    public static void occursmorehalfarr(int arr[])
    {
        int c=1;
    
        int i=1,n=arr.length;
    int m=n/2,l=0;
        while(i<n)
        {c=1;
            while(i<n&& arr[i]==arr[i-1])
            {
                c++;
                i++;
            }
            if(c>m)
            {
                l=c;
            }-
            i++;
        }
        System.out.println(l);
    }
}