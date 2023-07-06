package String;

import java.util.Scanner;

public class rotatematch {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
    System.out.println("enter a first string");
        String a=s.nextLine(); 
        System.out.println("enter a second string");
        String b=s.nextLine();
        rotatematchstr(a,b);
    }
    public static void rotatematchstr(String a,String b)
    {
        int alen=a.length();
        int len=alen;
        int blen=b.length();
        char ch1[]=a.toCharArray();
            char ch2[]=b.toCharArray();
        while(len!=0)
        {
            
            char temp[]=new char[a.length()];
            int t=0;
            char y=ch1[0];
            for(int i=1;i<ch1.length;i++)
            {
                ch1[t]=ch1[i];
                t++;
            }
            ch1[alen-1]=y;
            String res=new String(ch1);
            if(res.equals(b))
            {
                System.out.println("found");
                break;
            }
            len--;
        }
    }
}
