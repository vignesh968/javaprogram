import java.util.Arrays;
import java.util.Scanner;
//Sort an array in wave form
public class waveformsort {
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
int result[]=waveformsortarr(arr);
       System.out.println(Arrays.toString(result));
    }
    public static int []waveformsortarr(int arr[])
    {int temp[]=new int[arr.length];
        int t=0;
        int m1=-1,m2=0;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[j]<arr[i])
                {                 t=arr[i];
                    arr[i]=arr[j];
                    arr[j]=t;
                }
            }
            if(i%2==0)
            {m1+=2;
                temp[m1]=arr[i];
            }
            else
            {
                temp[m2]=arr[i];
            }
        }
        return temp;
    }
}
