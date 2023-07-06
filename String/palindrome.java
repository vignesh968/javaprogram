package String;

import java.util.Scanner;

public class palindrome {
  public static void main(String[] args) {
    
    Scanner s=new Scanner(System.in);
    String a=s.nextLine();
   palindromestring(a);
}  
public static void palindromestring(String a)
{
    int k=0;
    int start=0,end=a.length()-1;
  while(start<=end)
  {
    if(a.charAt(start)!=a.charAt(end))
    {
        k=1;
        break;
    }
    start++;
    end--;
  }
  System.out.println(k==0?"palindrome":"not a palindrome");
}
}