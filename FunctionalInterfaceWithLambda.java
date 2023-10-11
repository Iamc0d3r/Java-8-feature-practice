//An interface with only one abstract nethod
@FunctionalInterface
//annotation to mention interface as functional interface in java 8.
interface inter{
	public abstract void m1();					//abstract method, no implementation, no method method body.
}

class FunctionalInterfaceWithLambda{
	
	public static void main(String[] args){
		inter i = ()-> System.out.println("Hello");				//Lambda function,
		i.m1(); 												//?
	}
}

//output-   Hello