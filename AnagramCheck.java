import java.util.*;
class AnagramCheck
{
    public static void main(String args[])
    {
    String s1="Brag";
    String s2="Grab";
    s1=s1.toLowerCase();
    s2=s2.toLowerCase();
    char a1[]=s1.toCharArray();
    char a2[]=s2.toCharArray();
    Arrays.sort(a1);
    Arrays.sort(a2);
    String news1=new String(a1);
    String news2=new String(a2);
    if(news1.equals(news2))
    System.out.println("Anagram");
    else
    System.out.println("Not Anagram");

    }
}