class Frequncy
{
public static void main(String args[])
{
int a[]={1, 2, 8, 3, 2, 2, 2, 5, 1};
int freq;
for(int i=0;i<a.length;i++)
{
freq=1;
for(int j=i+1;j<a.length;j++)
{
if(a[i]==a[j])
{
a[j]=-1;
freq=freq+1;
}
}
if(a[i]!=-1)
System.out.println(a[i]+ "=>"+ freq);
}
}
}