abstract class bank
{
int calculateinterestrate();
}

class SBI extends Bank
{

int cal calculateinterestrate(int money, int time)
{
int rate=8;
 int interest=(money*rate*time)/100;
 return interest;
}
}
class PNB extends Bank
{
int cal calculateinterestrate(int money, int time)
{
int rate1=7;
 int interest=(money*rate*time)/100;
 return interest;
}
}

class Output
{
public static void main(String args[])
{
SBI obj1=new SBI();
PNB obj2=new PNB();
int x1=obj1.calculateinterestrate(1000,5);
int x2=obj2.calculateinterestrate(5000,3);
System.out.println(x1);
System.out.println(x2);
}
}



