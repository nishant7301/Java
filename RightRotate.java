class RightRotate
{
public static void main(String args[])
{
int a[]={1, 2, 3, 4, 5};
int n=4;
int len=a.length;
for(int i=len-n;i<len;i++)
System.out.println(a[i]);

for(int i=0;i<len-n;i++)
System.out.println(a[i]);

}
}
