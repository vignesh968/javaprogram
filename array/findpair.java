import java.util.Scanner;

public class findpair {
     public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter a size of array");
        int num=s.nextInt();
        System.out.println("enter a value of X");
        int target=s.nextInt();
        System.out.println("enter a array elements");
        int arr[]=new int[num];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=s.nextInt();
        }
         findpairarr(arr,target);
       
    }
    public static void findpairarr(int arr[],int target)
    {
for(int i=0;i<arr.length;i++)
{
    for(int j=i+1;j<arr.length;j++)
{
    if(arr[i]+arr[j]==target)
    {
        System.out.println("pair ( "+arr[i]+" , "+arr[j]+" )");
    }
}
}
    }
}
