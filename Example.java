import java.util.*;
class Example
{
static int stock(int arr[])
{
int diff[]=new int[arr.length-1];
for(int j=0;j<arr.length-1;j++)
{
 int max=arr[j+1];
for(int k=j+1;k<arr.length-1;k++)
{
 if(arr[k]<arr[k+1])
    max=arr[k+1];
}
diff[j]=max -arr[j];
}
int max1=diff[0];
for(int l=0;l<diff.length-1;l++)
{
 if(diff[l]<diff[l+1])
	max1=diff[l+1];
}
return max1;
}
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int arr[]=new int[n];
for(int i=0;i<arr.length;i++)
{
arr[i]=sc.nextInt();
}
int output=stock(arr);
System.out.println(output);

}
}

