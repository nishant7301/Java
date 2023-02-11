import java.util.Arrays;
import java.util.Comparator;
class StringGroup
{
public static void main(String args[])
{
String s="the way you see people is the way you treat them and the way you treat them is what they become";
String s1[]=s.split(" ");
Arrays.sort(s1,Comparator.comparing(t1->t1.length()));
int l=s1.length;
System.out.print(s1[0]);
for(int i=1;i<l;i++)
{
if(s1[i-1].length()==s1[i].length())
{
System.out.print(","+s1[i]);
}
else
{
System.out.println();
System.out.print(s1[i]);
}
}
}
}
