import java.util.*;
class RemoveDuplicate
{
static void Remove(char str[], int n)
{
HashSet<Character> s = new LinkedHashSet<>(n - 1);
for(char x:str)
s.add(x);
for(char t:s)
System.out.print(t);

}
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String s1=sc.nextLine();
char str[]=s1.toCharArray();
int len=str.length;
Remove(str,len);
}

}