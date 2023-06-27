package recursion;

import java.util.Scanner;

public class palindrome {
    
    public static void main(String[] args) {
        //int n = 10; // Define the number of Fibonacci numbers to generate
Scanner s=new Scanner(System.in);
String a=s.nextLine();
int start=0,end=a.length();
        // System.out.println("Fibonacci Series:");
        // for (int i = 0; i < n; i++) {
        //     System.out.print(fibonacci(i) + " ");
        // }
boolean b= palindromefun(a,start,end);
        System.out.println(b==true ? "true palindrome":"not a palindrome");
    }
    public static boolean palindromefun(String str, int low, int high){
    if(low>=high)
    {
        return true;
    }
   return str.charAt(low)==str.charAt(high)&& palindromefun(str, low+1, high-1);
}

}
