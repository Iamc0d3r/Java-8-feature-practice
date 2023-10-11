//without lambda expression
//An interface with only one abstract nethod
@FunctionalInterface
//annotation to mention interface as functional interface in java 8.
interface inter{
	public abstract void m1();					//abstract method, no implementation, no method method body.
}
class A implements inter{     					//interface implementation
	@Override
	public void m1(){							//method overriding
		System.out.println("Hello");
	}
}
class functionalInterface{
	
	public static void main(String[] args){
		A obj = new A();						//object
		obj.m1();								//object of class.method inside the class();
	}
}

//output:-   Hello