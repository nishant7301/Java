import java.util.*;
import java.lang.Math;  
class ArmstsrongNumber
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int temp=n;
double sum=0;
int digit=0;
while(temp>0)
{
temp=temp/10;
digit++;
}
temp=n;
while(temp>0)
{
int r=temp%10;
sum=sum+(Math.pow(r,digit));
temp=temp/10;
}
if(n==sum)
System.out.println("ArmstsrongNumber");
else
System.out.println("Not ArmstsrongNumber");
}
}