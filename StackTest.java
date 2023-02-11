import java.util.*;  
class StackTest{
static void insert(Stack<String> stack)	
{
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
stack.push(s);
System.out.println("Element Added");
}
static void delete(Stack<String> stack)	
{
if(stack.size()>=1)
{
stack.pop();
System.out.println("Element Removed");
}
else
System.out.println("Empty List");
}
static void display(Stack<String> stack)	
{
Iterator<String> itr=stack.iterator();  
while(itr.hasNext()){  
System.out.println(itr.next());  
}
}
public static void main(String args[]){
Scanner sc=new Scanner(System.in);	
Stack<String> stack = new Stack<String>();
while(true)
{
System.out.println("choose your Option:");
System.out.println("1 Insert");
System.out.println("2 Delete");
System.out.println("3 Display the Element");
System.out.println("4 Exit");
int n=sc.nextInt();
switch(n)
{
case 1:
System.out.println("Enter the Element you want to insert");
insert(stack);
break;
case 2:
delete(stack);
break;
case 3:
display(stack);
break;
case 4:
System.exit(0);
} 

} 
} 
} 