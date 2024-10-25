package functionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalInterface {

	public static Optional<Integer> findMax(List<Integer> numbers) {
        return numbers.stream().max(Integer::compare);
    }
	public static void main(String[] args) {
        
        List<Integer> numbers = Arrays.asList(10, 25, 30, 5, 15);
        Optional<Integer> max=findMax(numbers);
        max.ifPresentOrElse(v->System.out.println("Max: "+v), ()-> System.out.println("List is empty"));
	}
}
