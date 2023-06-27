package String;

import java.util.Arrays;
import java.util.Scanner;

public class removeduplicate {
   
   public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    System.out.println("enter a String");
    String str=s.nextLine();
removeduplicatearr(str);

   } 
public static void removeduplicatearr(String str)
{
    char ch[]=str.toCharArray();
    int i,j;
    int p=0,t=0;
    char ar[]=new char[ch.length];
    for(i=0;i<ch.length;i++)
    {p=0;
        for(j=0;j<ar.length;j++)
        {
            if(ar[j]==ch[i])
            {  
               p=1;
            }
        }
        if(p==0)
        {
            ar[t]=ch[i];
            t++;
        }
    }
    System.out.println(Arrays.toString(ar));
}
}
