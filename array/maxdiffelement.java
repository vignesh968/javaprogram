import java.util.ArrayList;
import java.util.Scanner;

public class maxdiffelement {
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
maxdiff(arr);
    } 
    public static void maxdiff(int arr[])
    {
 int y=0;
 int mis=0,current=0;
 ArrayList<Integer> li=new ArrayList<>();
 int t=-25244;
        for(int i=0;i<arr.length-1;i++)
        {for(int j=i+1;j<arr.length;j++)
            {
            mis=arr[j]-arr[i];     
            if(mis>t)
            {
                t=mis;
            }
            }}
        
        
    
 System.out.println(t);
}
}