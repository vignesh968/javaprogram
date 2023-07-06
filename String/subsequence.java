package String;

import java.util.Scanner;

public class subsequence {
    public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    System.out.println("enter a first string");
        String a=s.nextLine(); //abcde                   //absed
        System.out.println("enter a second string");
        String b=s.nextLine();//ace  //true              //ads   //false


if(subsequencestr(a,b)==true)
{
    System.out.println("string are subsequence");
}
else{
    System.out.println("not a subsequence");
}

   }
   public static boolean subsequencestr(String a,String b)
   {
    int i=0,j=0;
    int s1=a.length();
    int s2=b.length();
    for( i=0;i<s1&&j<s2;i++)
    {
        if(a.charAt(i)==b.charAt(j))
        {
            j++;
        }
        
    }
    return (j==s2)? true: false ;//if all characters of substring are present

   }
}
