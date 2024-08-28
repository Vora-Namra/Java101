import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamDemo{
    public static void main(String[] args) {
        List<Integer>   nums = Arrays.asList(4,5,1,28,3,0);

        Stream<Integer> data = nums.stream();
        data.filter(n->n%2==0)
        .sorted().map(n->n*2)
        .forEach(n->System.out.println(n));
        
        
    }
}