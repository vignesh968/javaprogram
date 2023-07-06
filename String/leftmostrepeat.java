package String;

import java.util.Scanner;

public class leftmostrepeat {
     public static void main(String[] args) {
    
    Scanner s=new Scanner(System.in);
    String a=s.nextLine();
  int y=leftmostrepeatstring(a);
 // System.out.println((y>=0)?y+" at position first time acquire":"not acquire");
System.out.println(y);
}  
// public static int leftmostrepeatstring(String a){
//     int n = a.length(), i, j;
//     int y=0;
//     for( i=0;i<a.length();i++)
//     {
//         for(j=i+1;j<a.length();j++)
//         {
//             if(a.charAt(i)==a.charAt(j))
//             {
//                 return i;
//             }
//         }
//     }
//     return -1;
// }
public static int leftmostrepeatstring(String a)
{
    int res=-1;
    boolean vistied[]=new boolean[26];
    for(int i=a.length()-1;i>=0;i--)
    {
        if(vistied[a.charAt(i)-'a']){
            res=i;
        }
        else{
            vistied[a.charAt(i)-'a']=true;
        }
    }
    return res;
}
}
