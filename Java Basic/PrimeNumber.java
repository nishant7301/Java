import java.util.*;
class PrimeNumber
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
if(n==1)
System.out.println("Not Prime");
if(n==2)
System.out.println("Prime");
int m=n/2;
int flag=0;
if(n>2)
{
for(int i=2;i<=m;i++)
{
if(n%i==0)
{
flag=1;
}
}
if(flag==1)
System.out.println("Not Prime");
else
System.out.println("Prime");
}
}
}