import java.util.*;

class Lambda_expression {
	
	public static void main(String[] args){
		
		int[] array  = new int[5];
		array[0] = 1;
		array[1] = 5;
		array[2] = 7;
		array[3] = 3;
		array[4] = 2;
		
		for(int n : array){
			System.out.println("nomal expression: " + n);
			//normaly written code.
		}
		
		
		Arrays.stream(array).forEach(n-> {System.out.println("Lambda expression: " + n);}); 
		}
}
		/* lambda expression 
		The syntax of a lambda expression is 
			(parameters) -> {body}
		Lambdas allow implementing functional interfaces (interfaces with only one abstract method) in a concise way.
		If the body is a single expression, curly braces can be omitted: (x) -> x+1
		Parameter types can be omitted if inferable from context: (x) -> x+1
		in methods we don't need to write access modifier, name of method and return type.
		
		public void hello(){
			System.out.printl("Hello");
		}
		it become:-
		()->system.out.println("Hello");
		*/
	