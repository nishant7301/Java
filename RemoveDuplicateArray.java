class RemoveDuplicateArray
{
public static void main(String args[])
{
int a[]={10,70,30,90,20,20,30,40,70,50};
for(int i=0;i<a.length;i++)
{
for(int j=i+1; j<a.length;j++)
{
if(a[i]==a[j])
{
a[j]=-1;
}
}
}
for(int i=0;i<a.length;i++)
{
if(a[i]!=-1)
System.out.println(a[i]);
}

}
}