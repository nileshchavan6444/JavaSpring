package Programs;

import java.util.function.Consumer;

//interface ConsumerD 
//{
//	void accept(String str);
//}

//class TestDemo implements ConsumerD{
//
//	@Override
//	public void accept(String str) {
//		System.out.println(str);
//		
//	}
//	
//}

public class ConsumerDemo {
	
public static void main(String[] args) {
	
//	TestDemo d = new TestDemo();
//	d.accept("Hello World");
//	
//	ConsumerD d1 = new TestDemo();
//	d1.accept("Using Parent class Ref");
//	
	
	//ConsumerD d2 = str -> System.out.println(str);
//	d2.accept("using lamda expression");
	
	Consumer<String> d3 = str -> System.out.println(str);
		d3.accept("using consumer Lamda Expression");
		
	Consumer<Integer> d4 = i -> System.out.println("squre of the number is "  + i * i);
	d4.accept(6);
	
	Consumer<Integer> d5 = no ->
			{
				if (no % 2 ==0)
				{
					System.out.println( no + " is Even");
				}
				else 
					System.out.println( no + "  is  is odd");
			};
			

			d5.accept(14);
			
		
	
}
}
