package String;
import java.util.*;

public class maxoccur {
   public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    System.out.println("enter a String");
    String str=s.nextLine();
maxoccurarr(str);

   }

public static void maxoccurarr(String str)
   {
    char ch[]=str.toCharArray();
    int c=1;
    char a='\0';
    int max=0;
    char jj='\0';
    for(int i=0;i<ch.length;i++)
    {c=1;
        for(int j=i+1;j<ch.length;j++)
        {
            if(ch[i]==ch[j])
            {
                c++;
            }
        }
        if(max<c)
        {
            max=c;
           jj=ch[i];

        }
    }
    System.out.print(jj);
   } 
}
