import java.util.*;
import java.util.stream.Stream;
import java.util.stream.Collectors;

class updateStreamAPI{
	public static void main(String[] args){
		ArrayList<Integer> newList = new ArrayList<Integer>(Arrays.asList(10,20,30,40,50,60));
		System.out.println(newList);
		
		List<Integer> collect= newList.stream().map(i-> i+5).collect(Collectors.toList());
		System.out.println(collect);
	}
}
