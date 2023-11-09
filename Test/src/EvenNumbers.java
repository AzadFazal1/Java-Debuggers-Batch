import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class EvenNumbers {

	public static void main(String[] args) {
		
//		List<Integer> list = List.of(1, 2, 3, 4,5, 6, 7, 8, 9, 10);
//		List<Integer> result = list.stream().filter(x-> x%2 == 0).map(x->x*2).collect(Collectors.toList());
//		System.out.println(result);
		
		
		
		//string first repeated
		
		//String string = "My name is Azad";
		
		//char []charArray = string.toCharArray();
		//int number = 123;
		Predicate<Integer> result= (number) -> {
			for(int i = 2; i < number/2; i++) {
				if(i%number == 0) {
					return false;
				}
			}
				return true; 
		};
		System.out.println(result.test(122));
		
			
		
		
		
			
		
		
	
	}

}
