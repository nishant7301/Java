import java.util.*;
class FibonacciExample {
public static void main(String args[])
{
int n1=0,n2=1;
int n3;
Scanner sc=new Scanner(System.in);
int count=sc.nextInt();
System.out.println(n1);
System.out.println(n2);
for(int i=2;i<=count;i++)
{
n3=n1+n2;
System.out.println(n3);
n1=n2;
n2=n3;
}
}
    
}