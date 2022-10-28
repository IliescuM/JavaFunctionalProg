package functionalInterface;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _Function {
    public static void main(String[] args) {
        // funciton takes one argument and takes one result
        int increment = incrementByOne(1);
        System.out.println(increment);
        int increment2 = incrementByOneFunction.apply(1);
        System.out.println(increment2);
        int multiply = multiplyBy10Function.apply(increment2);
        Function<Integer,Integer> addBy1AndThenMultiplyBy10 =
                incrementByOneFunction.andThen(multiplyBy10Function);

        System.out.println(multiply);
        System.out.println(addBy1AndThenMultiplyBy10.apply(4));

        // BiFunction
        // takes 2 arguments and one result
        System.out.println(incrementByOneAndMultiply(4,100));
        System.out.println(incrementByOneAndMultiplyBiFunction.apply(4,100));
    }

    static Function<Integer, Integer> incrementByOneFunction = number -> number + 1;

    static Function<Integer,Integer> multiplyBy10Function= number -> number*10;


    static int incrementByOne(int number){
    return number +1;
    }
    static BiFunction<Integer,Integer,Integer> incrementByOneAndMultiplyBiFunction = (numberToIncrementByOne, numberToMultiplyBY)
                    -> (numberToIncrementByOne+1 ) *numberToMultiplyBY;
    static int incrementByOneAndMultiply(int number,int numberToMultiplyBy){
        return (number +1)*numberToMultiplyBy;
    }
}
