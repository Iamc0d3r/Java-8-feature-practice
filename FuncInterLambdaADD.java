@FunctionalInterface
interface Adder{								//functional interface
	public abstract void add(int a, int b);
}
class FuncInterLambdaADD{
	public static void main(String[] args){
		Adder i = (a,b)->System.out.println(a+b);		//Lambda expression
		i.add(4,5);
	}
}


//another example of Functional interface and lambda expression