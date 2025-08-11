package functional;

import java.util.function.Function;

public class FuncAsReturnType {
    Function<Integer, Function<Integer,Integer>> multiplyBy = (a) -> (b) -> a * b;
}
