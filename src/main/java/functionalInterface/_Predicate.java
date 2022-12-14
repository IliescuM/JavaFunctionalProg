package functionalInterface;

import java.util.function.Predicate;

public class _Predicate {
    public static void main(String[] args) {
        System.out.println("Without predicate: ");
        System.out.println(isPhoneNumberValid("07000000000"));
        System.out.println(isPhoneNumberValid("09342342344"));
        System.out.println(isPhoneNumberValid("0734234234"));

        System.out.println("With predicate: ");

        System.out.println(isPhoneNumberValidPredicate.test("07000000000"));
        System.out.println(isPhoneNumberValidPredicate.test("09342342344"));
        System.out.println(isPhoneNumberValidPredicate.test("0734234234"));

        System.out.println(
                "Is Phone number valid and contains number 3 = " +
                isPhoneNumberValidPredicate.and(containsNumber3).test("09342342344"));;
        System.out.println(
                "Is Phone number valid and contains number 3 = " +
                        isPhoneNumberValidPredicate.and(containsNumber3).test("07000300000"));;


    }
    static boolean isPhoneNumberValid(String phoneNumber){
        return phoneNumber.startsWith("07") & phoneNumber.length() == 11;
    }

    static Predicate<String> isPhoneNumberValidPredicate = phoneNumber ->
            phoneNumber.startsWith("07") & phoneNumber.length() == 11;

    static Predicate<String> containsNumber3 = phoneNumber -> phoneNumber.contains("3");
}
