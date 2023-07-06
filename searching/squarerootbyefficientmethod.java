package searching;

import java.util.Scanner;

public class squarerootbyefficientmethod {
    public static void main(String[] args) {
        System.out.println("enter a number");
       Scanner s=new Scanner(System.in);
       int a=s.nextInt();
       int res=squarerootbyefficientmethodnum(a);
    System.out.println(res);
    }
    public static int squarerootbyefficientmethodnum(int n)
    {
        int low=1,ans=0,high=n;
    while(low<=high)
    {

        int mid=(low+high)/2;
        int msqr=mid*mid;
        if(msqr==n)
        {
            return mid;
        }
        else if(msqr>n)
        {
            high=mid-1;
       
        }
        else
        {
            low=mid+1;
            ans=mid;
        }
    }
 return ans;   
}  
    
}
