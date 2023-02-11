import java.util.*;
class Palindrome
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int sum=0;
int p=n;
while(n>0)
{
int r=n%10;
sum=sum*10+r;
n=n/10;
} 
if(p==sum)
System.out.println("Palindrome");
else
System.out.println("Not Palindrome");
}
}
