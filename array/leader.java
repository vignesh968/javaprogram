import java.util.*;
public class leader
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
leaderarr(arr);
    }
    public  static void leaderarr(int arr[])
    {int t=0, y=0;
    int temp[]=new int[arr.length];
        //            String ar=" ";
        for(int i=0;i<arr.length;i++)
        {y=0;
            for(int j=i+1;j<arr.length;j++)
        
        {
            if(arr[i]<arr[j])
            {
             y=1;   
             break;
            }
        }
if(y==0)
{
    temp[t]=arr[i];
    t++;
}
    }
    for(int i=0;i<t;i++)
    {
        System.out.print(temp[i]+" ");
    }
    //    return 0;
    }
}