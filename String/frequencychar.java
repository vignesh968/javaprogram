package String;

import java.util.Scanner;

public class frequencychar {public static void main(String[] args) {
    
    Scanner s=new Scanner(System.in);
    String a=s.nextLine();
    frequencycharstring(a);
}
    public static void frequencycharstring(String a)
    {
        int count[]=new int[26];
        for(int i=0;i<a.length();i++)
        {
            count[a.charAt(i)-'a']++;

        }
        for(int i=0;i<26;i++)
        {
            if(count[i]>0)
            {
                System.out.println((char)(i+'a')+" "+count[i]);
            }
        }
    }
}
