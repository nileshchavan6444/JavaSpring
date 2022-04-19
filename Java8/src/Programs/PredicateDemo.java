package Programs;

import java.util.function.Predicate;

interface PredicateInterf
{
	boolean test(Integer no);
}
class MyPredicate implements PredicateInterf
{
	@Override
	public boolean test(Integer no) {
		
		if(no % 2 ==0)
			return true;
		else
			return false;
	}
	
}

public class PredicateDemo {
	public static void main(String[] args) {
		
//		MyPredicate p = new MyPredicate();
//		boolean test = p.test(10);
//		if(test == true)
//			System.out.println("no is even");
//		else 
//			System.out.println("no is odd");
		
		
//		PredicateInterf p1= no -> no % 2 ==0 ;
//		
//		boolean test1 = p1.test(11);
//		System.out.println(test1);
//
//		
		
		Predicate<String> p3= str-> str.length() > 5 ? true: false;
			
		boolean validString = p3.test("Hibernate");
		
		if(validString)
			System.out.println("Valid String");
		else
			System.out.println("Invalid String");
	}

}

