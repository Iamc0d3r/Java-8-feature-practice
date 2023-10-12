interface intero{
	default void m1(){
		System.out.println("hello");
	}
}
class defaultMethod implements intero{
	public static void main(String[] args){
		defaultMethod t = new defaultMethod();
		t.m1();
	}
}

/*
interface contains method which does not have implementation but if that method is used by multiple classes it become difficult to make changes on multiple places.
default method helps us writing implementation inside the interface in java 1.8

*/