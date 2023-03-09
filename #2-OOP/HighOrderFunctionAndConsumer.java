import java.util.List;
import java.util.Arrays;

public class HighOrderFunctionAndConsumer {
    public static void main(String[] args) {
        List<String> facts = Arrays.asList(
            "A random paragraph can also be an excellent way for a writer to tackle writers' block.",
            "Writing block can often happen due to being stuck with a current project that the writer is trying to complete.",
            "By inserting a completely random paragraph from which to begin, it can take down some of the issues that may have been causing the writers' block in the first place."
        );

        facts.forEach(fact -> System.out.println(facts)); // Our Lambda
    }
}
