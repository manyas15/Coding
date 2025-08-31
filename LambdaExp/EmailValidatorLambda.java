
@FunctionalInterface
interface EmailValidator {

    boolean isValidEmail(String Email);
}

public class EmailValidatorLambda {

    public static void main(String[] args) {
        EmailValidator validator = (String email) -> {
            return email.contains("@") && email.endsWith(".com");
        };

        System.out.println(validator.isValidEmail("test@java.co"));
    }
}
