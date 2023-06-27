package recursion;

import java.util.Scanner;

public class sumofdigit {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter a number");
        int a=s.nextInt();
       int y= sumofdigitfun(a);
       System.out.println(y);
    }
    public static int sumofdigitfun(int a)
    {
        if (a==0){
            return 0;

        }else{

            return ((a%10)+sumofdigitfun(a/10));
        }
    }
}
