//finally after catch possible.try,catch,finally,one finally with try catch,
//but not depend on try catch ,execute seprate also
class FinallyExample{  
	public static void main(String[] args){  
	try{  
	int x=300;   //1.no exception
	}
	catch(Exception e)
	{
		System.out.println(e);
	}  
	finally{System.out.println("finally block is executed");//2.so finally block executed.
	}  
	}}  
	
	
//finally block after exception	
	class Testtrycatch2{  
	public static void main(String[] args){  
	try{  
	int x=300/0;   //1. exception
	}
	catch(ArithmeticException e) //2.handle
	{
		System.out.println(e);
	}  
	finally{System.out.println("finally block is executed");//3.after finally block executed.
	}  
	}}
	
	
	//error
	//finally after finally not possible
	class Testtrycatch2{  
	public static void main(String[] args){  
	try{  
	int x=300/0;   //1. exception
	}
	catch(ArithmeticException e) //2.handle
	{
		System.out.println(e);
	}  
	finally{
		System.out.println("finally block is executed");//3.after finally block executed.
	}
	finally{
		System.out.println("finally block1 is executed");
	}  
	}
}
	