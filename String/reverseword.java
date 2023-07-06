package String;

import java.util.Scanner;

public class reverseword {
    public static void main(String[] args) {
    
    Scanner s=new Scanner(System.in);
    String a=s.nextLine();
 
 String[] st=a.split(" ");

reversewordstr(st);
}
public static void reversewordstr(String[]str)
{
    String d[]=new String[str.length];
    for(int i=str.length-1;i>=0;i--)
    {
    
            System.out.print(str[i]);
        
        System.out.println(" ");
    }

}  
}
