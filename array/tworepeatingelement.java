import java.util.Scanner;
//Implementation for finding the two repeating elements in the given array
public class tworepeatingelement {
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
tworepeatingelementarr(arr);
       
    }
    public static void tworepeatingelementarr(int arr[])
    {
        int p=0;
        int temp[]=new int[arr.length];
         for(int i=0;i<arr.length-1;i++)
    {p=0;
        for(int j=i+1;j<arr.length;j++)
        {
            if(arr[j]==arr[i])
            {  
               System.out.println(arr[j]);
            }
        }
      
    }

    }
}
