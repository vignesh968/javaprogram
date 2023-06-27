import java.util.Arrays;
import java.util.Scanner;

public class productarrary {
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
productarraryarr(arr);
       
    } 
    public static void productarraryarr(int arr[])
    { int product=1;
     int temp[]=new int[arr.length];
     int left[]=new int[arr.length];
     int right[]=new int[arr.length];   
      int leftprod=1,rightprod=1;
     int y=arr.length-1;
     for(int i=0;i<arr.length;i++)
     {product=1;
        for(int j=0;j<arr.length;j++)
        {
            if(i!=j)
            {
             product*=arr[j];
            }
        }
leftprod=1;
    for(int j=0;j<=i;j++)
    {
        leftprod*=arr[j];
    }
    left[i]=leftprod;
rightprod=1;
    for(int k=arr.length-1;k>=arr.length-1-i;k--)
    {
        rightprod*=arr[k];
    }
    right[y]=rightprod;
    y--;
        temp[i]=product;
     }   

for(int i=0;i<prod.length;i++)
{

}

     System.out.println(Arrays.toString(temp));
    

System.out.println(Arrays.toString(left));
System.out.println(Arrays.toString(right));    
    }
}