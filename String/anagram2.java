package String;

public class anagram2 {
  public static void main(String[] args) {
    String  a="silent";
    String b="lisent";
int y=0;
if(a.length()!=b.length())
{
    System.out.println("not a anagram");
}
else
{
    
    for(int i=0;i<a.length();i++)
    {
        for(int j=0;j<b.length();j++)
        {
        if(a.charAt(i)==b.charAt(j))
        {
            y++;
        }
        }
}
System.out.println((y==b.length())?"anagram":"not a anagram");
}  
}
}