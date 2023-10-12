import java.util.predicate;

class predicates{
	public static void main(String[] args){
		Predicate<Integer>u=v-> v>50;
		System.out.println(u.test(1));
	}
}