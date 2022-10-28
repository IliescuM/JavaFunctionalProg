package combinatorpattern;

import java.time.LocalDate;

import static combinatorpattern.CustomerRegistrationValidator.*;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer(
                "Alice",
                "alice@gmail.com",
                "+07341235555",
                LocalDate.of(2000,1,20)

        );
//        System.out.println(new CustomerValidatorService().isValid(customer));

        // if valid we can store customer in db

        // Using combinator pattern
        ValidationResult result = isEmailValid()
                .and(isPhoneNumberValid())
                .and(isAdult())
                .apply(customer);

        System.out.println(result);

        if(result != ValidationResult.SUCCES){
            throw new IllegalStateException(result.name());
        }
    }
}
