package searching;
import java.util.*;
public class squareroot {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter a number");

        int n =s.nextInt();
       System.out.println( squarerootnum(n));
    }
    public static int squarerootnum(int n)
    {
        int i=1;
        while(i*i<=n)
        {
            i++;
        }
        return i-1;
    }
    
}
