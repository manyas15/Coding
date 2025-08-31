import java.util.Optional;

public class OptionalDemo{
    public static void main(String[] args) {
        Optional<String> name = Optional.of("");

        //Print if present

        name.ifPresent(n -> System.out.println("Hello, " + n));
    }
}