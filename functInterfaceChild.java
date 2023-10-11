@FunctionalInterface
interface parent{
	public abstract void m1();
}
@FunctionalInterface
interface child extends parent{
	public abstract void m1();
}

class functInterfaceChild{
	
	public static void main(String[] args){
		child i = () -> System.out.println("Hello");
		i.m1();
	}
}

//if an interface extends another interface and child interface does not contain any new method then child is also functional interface.