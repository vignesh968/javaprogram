import java.util.Scanner;

public class leadereffiicientway {
    
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
      System.out.println("enter a size");
        int num=s.nextInt();
        int arr[]=new int[num];
        System.out.println("enter a element");
for(int i=0;i<num;i++)
{
    arr[i]=s.nextInt();
}
leaderefficientarr(arr);
    }
    public  static void leaderefficientarr(int arr[])
    {
        int currentelement=arr[arr.length-1];
        System.out.print(currentelement+" ");
        for(int i=arr.length-2;i>=0;i--)
        {
            if(currentelement<arr[i])
            {
                currentelement=arr[i];
                System.out.print(currentelement+" ");
            }
        }
    }
}
