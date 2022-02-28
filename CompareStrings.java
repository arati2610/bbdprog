public class CompareStrings{
	
public static boolean compare(String x,String y)
{
   if(x==null||y==null)
   {
   return false;
   }
   
   if(x.length()!=y.length())
   return false;

   for(int i=0;i<x.length();i++)
   {
     if(x.charAt(i)!= y.charAt(i)
	 return false;
	}
	 
	 return true;
	}
public static void main(String args[])
{
  String x="mommy ABC";
  String y="momny ABC";
  System.out.println("String x="+ x +" and String y=" +y +" are equal??" +compare(x,y));
 }
}

































