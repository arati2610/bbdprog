class A
{
private int a=10;
void get()
{
final int b=20;
System.out.println(a);
}

public static void main(String args[])
{
A a=new A();
a.get();
}
}
