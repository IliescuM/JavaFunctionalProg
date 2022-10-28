package optionals;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        Object value = Optional.ofNullable("Hello")
                .orElseGet(() -> "default value");
        Object value2 = Optional.ofNullable("Hello")
                .orElseThrow(() -> new IllegalStateException("exception"));
         Optional.ofNullable("email@gmail.com")
                .ifPresentOrElse(email-> System.out.println("Sending email to "+ email),
                        ()->{
                            System.out.println("Cannot send email");
                        });
        System.out.println(value);
    }
}
