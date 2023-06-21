//40.Count number of smaller elements on right of each element in an array
// input 
// 7 
// 7 2 4 9 8 1 5//  7 has 4 small elements in right side
//output
// 4 1 1 3 2 0 0
import java.util.Arrays;
import java.util.Scanner;

public class smallelemofrightside {
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
      int result[]=  smallelemofrightsidearr(arr);
       System.out.println(Arrays.toString(result));
    }
    public static int [] smallelemofrightsidearr(int arr[])
    {
        int temp[]=new int[arr.length];
        //for storing the count of small values
        int c=0;//counting variable to store no.of times
    int element=0;
        for(int i=0;i<arr.length;i++)
        {c=0;
            element=arr[i];
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]>arr[j])
                {
                    c++;
                }
            }
            temp[i]=c;
        }
        return temp;
    }
}
