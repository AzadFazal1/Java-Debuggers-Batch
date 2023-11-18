import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;



public class StreamsDemonstration {

	static void firstRepeatingCharacter(String str) {
		
		Map<Character, Long> charToCount =  str.chars().mapToObj(x->(char)x).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new,  Collectors.counting()));
		charToCount.forEach((key, value)-> {
			
			if(value > 1) {
				System.out.println(key);
				
			}
		});
//		for(Entry <Character, Long> entry : charToCount.entrySet()) {
//			if(entry.getValue() > 1) {
//				System.out.println(entry.getKey());
//				break;
//			}
//		}
	
	}
	public static void main(String[] args) {
		firstRepeatingCharacter("abcdadda");
		System.out.println();
		// Methods for generating streams 
		
		// Method - 1 
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
		Stream<Integer> stream = list.stream();
		
		// Method - 2
		int [] arr = {1, 2, 3, 4, 5};
		Arrays.stream(arr).forEach(System.out::println);
		
		// Method - 3
		Stream.of(1, 2, 3, 4, 5);
		
		// Method - 4
		
		Stream<Integer> intStream = Stream.iterate(1, x -> x + 2).limit(10);
		
		intStream.forEach(x->System.out.println(x));
		
		// Method - 5
		
		Stream.generate(()->(int)(Math.random()*100))
				.limit(10)
				.forEach(x->System.out.println(x));
		
		List<String> namesList = Arrays.asList("Kirik", "Audie", "Tochi", "Joe","Audie",  "Sufian", "Amire", "Abdal", "Abdal", "Abdal", "Saurang", "Azad");
		
		Set<String> result = namesList
				.stream()
				.filter(name -> name.startsWith("A"))
				//.distinct()
				//.limit(3)
				.skip(2)
				.collect(Collectors.toSet());
		
		System.out.println(result);
		
		Map<String, Long> namesToCount = namesList.stream()
				.collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new ,Collectors.counting()));
		
		 namesList
		 .stream()
		 .sorted((a, b)-> b.compareTo(a))
		 .forEach(System.out::println);
		System.out.println(namesToCount);
		
		System.out.println("+++++++++++++++++++++++++++");
		namesList.stream().filter(name->name.startsWith("A")).peek(System.out::println).collect(Collectors.toList());
	
		Optional<Integer> sum = list.stream().reduce((x, currentSum)->x*currentSum);
		if(sum.isPresent()){
		System.out.println(sum.get());
		}
		
	}

}
