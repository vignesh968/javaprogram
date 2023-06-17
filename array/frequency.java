import java.util.Scanner;

public class frequency
{
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
//for()
frequencyarr(arr,num);
    }
    public static void frequencyarr(int arr[],int num)
    {
 int freq=1,i=1;
        while(i<num)
        {
            while(i<num && arr[i]==arr[i-1])
            {
                freq++;
                i++;
            }
            System.out.println(arr[i-1]+"  "+freq);
            i++;
            freq=1;
        }if(num==1||arr[num-1]!=arr[num-2])
        {
            System.out.println(arr[num-1]+"  "+ 1);
        }
    }
}