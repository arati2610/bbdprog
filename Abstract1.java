abstract class Abstract1
{
abstract void get();
abstract void show();
}
class Abstract2 extends Abstract1
{
  void get()
  {
    System.out.println("get method");
  }
   void show()
  {
    System.out.println("show method");
  }
  public static void main(String args[])
  {
   Abstract1 a=new Abstract2();
   a.get();
   a.show();
   }
   }
  