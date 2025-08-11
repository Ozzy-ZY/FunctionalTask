package functional;

import java.util.function.BiFunction;
import java.util.function.Function;

public class FuncAsVar {
    BiFunction<Integer, Integer, Integer> add = (a, b) -> a + b;
}
