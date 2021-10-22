import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DictionaryGenerator {
	
	public static void main(String[] args) {
		
		String text = "мама мыла раму раму мыла мама";
		
		Function<String, List<String>> function = msg -> Arrays.stream(msg.split(" "))
				.distinct()
				.sorted()
				.collect(Collectors.toList());
		
		List<String> words = function.apply(text);
		
		words.forEach(System.out::println);
		
	}
}
