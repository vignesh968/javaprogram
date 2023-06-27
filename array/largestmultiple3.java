import java.util.Arrays;
import java.util.Scanner;
//43.Find the largest multiple of 3
//6
//369 370 371 7373 3383 33838

//output
 //369 3 3 33 333 333
 // largest   multiple of 3 is 369
public class largestmultiple3 {
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
        Arrays.sort(arr);
int sum=0;
        for(int i=0;i<arr.length;i++)
    {
    int p=arr[i];
    sum=0;
    while(p!=0)
    {
    sum+=p%10;
    p/=10;
    }
    
   int l= largestmultiple3arr(sum,arr[i]);
}    
int sm=0;
Arrays.sort(arr);
System.out.println(Arrays.toString(arr));
System.out.println("largest multiple of 3:"+arr[arr.length-1]);

    }
    public static int largestmultiple3arr(int a,int sum)
    {int h=0;
        if(sum%3==0)
        {
            return sum;
        }
        else 
        {
            int sp=sum;
            while(sp!=0)
            {
                int y=sp%10;
                if(y%3==0)
                {
            h=h*10+y;       
                }
                sp/=10;
            }
        }
        return h;
    }
}
