package Java8Practice;

//class Demo implements FunctionInTerfaceDemo 
//{
//
//	@Override
//	public void m1(int i) {
//		System.out.println(i * i);
//	}
//	
//}

class Demo implements FunctionInTerfaceDemo
{

//	public boolean isEven(int no)
//	{
//		if(no % 2==0)
//			return true;
//		else
//			return false;
//	}
	
	public int strLenght(String str)
	{
		return str.length();
	}
	
}


public class Test {
	public static void main(String[] args) {
	

		//traditional
//		Demo d = new Demo();
//		d.m1(5);
//		
		//Lamda  
		
//		FunctionInTerfaceDemo obj = i -> System.out.println(i * i);
//		obj.m1(7);
		
		
		// Traditioanal
		//Demo d = new Demo();
		//System.out.println(d.strLenght("hello World"));
		
		// Lamda
		
	//	FunctionInTerfaceDemo obj = (a,b)-> System.out.println(a+b);
		//	obj.add(66,44);
		
		
	//	FunctionInTerfaceDemo obj = (a,b) -> a+b;
	//	System.out.println(obj.add(15, 12));
			
		
		
	//FunctionInTerfaceDemo obj = no -> no%2 ==0;
		//System.out.println(obj.isEven(24));
		
		FunctionInTerfaceDemo obj  =(String str)-> str.length();
		System.out.println(obj.strLenght("Spring"));
		
		
	}

}
