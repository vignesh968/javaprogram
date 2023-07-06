package String;

import java.util.Scanner;

public class anagram {
 public static void main(String[] args) {
       Scanner s=new Scanner(System.in);
    System.out.println("enter a first string");
        String a=s.nextLine(); 
        System.out.println("enter a second string");
        String b=s.nextLine();
    if( anagramstr(a,b)==true)
{
    System.out.println("string are  anagramstr(a,b)");
}
else{
    System.out.println("not a  anagramstr(a,b)");
}

 }   
 public static boolean anagramstr(String a, String b)
 {
    int count[]=new int[26];
    if(a.length()!=b.length())
    {
        return false;
    }
    for(int i=0;i<a.length();i++)
    {
        count[a.charAt(i)-'a']++;
        count[b.charAt(i)-'a']--;
    }
      for(int i=0;i<26;i++)
        {
            if(count[i]!=0)
            {
                return false;
            }
        }
        return true;
 }
}
