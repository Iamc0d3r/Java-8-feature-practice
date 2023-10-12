interface intero{
	default void m1(){
		System.out.println("hello"); // default method with implementation
	}
}
class defaultMethodOverride implements intero{
	public static void main(String[] args){
		defaultMethodOverride t = new defaultMethodOverride();
		t.m1();
	}	
		public void m1(){
		System.out.println("bye");     // default method override
	}
}

/*
interface contains method which does not have implementation but if that method is used by multiple classes it become difficult to make changes on multiple places.
default method helps us writing implementation inside the interface in java 1.8

*/

/*output
		=> Bye

 */
 /*for situation in which there are more than one inetrface having same method name and class is implementing them together then it will give error. To solve this either override the method or use super keyword to denote interface name. */