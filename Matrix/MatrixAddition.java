import java.util.*;
class MatrixAddition
{
 public static void main(String args[])
 {
 Scanner sc=new Scanner(System.in);
 int x=sc.nextInt();
 int y=sc.nextInt();
 int a[][]=new int[x][y];
 int b[][]=new int[x][y];
 int c[][]=new int[x][y];
 for(int i=0;i<x;i++)
 {
    for(int j=0;j<y;j++)
    {
    a[i][j]=sc.nextInt();
    }
 }
 for(int i=0;i<x;i++)
 {
    for(int j=0;j<y;j++)
    {
    b[i][j]=sc.nextInt();
    }
 }
 for(int i=0;i<x;i++)
 {
    for(int j=0;j<y;j++)
    {
    c[i][j]=a[i][j]+b[i][j];
    }
 }
 for(int i=0;i<x;i++)
 {
    for(int j=0;j<y;j++)
    {
    System.out.print(c[i][j] +" ");
    }
    System.out.println();
 }

 }

}