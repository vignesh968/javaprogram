package String;

import java.util.Scanner;

public class patternmatching {
     public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    System.out.println("enter a first string");
        String a=s.nextLine(); 
        System.out.println("enter a second string");
        String b=s.nextLine();
patternmatchingstr(a,b);

   }
   public static void patternmatchingstr(String a, String b)
   {//aaaa
    // aa
    //0 1 2
   
   
    int len1=a.length();
    int len2=b.length();
    for(int i=0;i<=len1-len2;i++)
    {int j;
    for( j=0;j<len2;j++)
    {
        if(a.charAt(i+j)!=b.charAt(j))
        {
            break;
        }
    }
    if(j==len2)
    {
     System.out.println(i);
    }
   
    }
   }
}