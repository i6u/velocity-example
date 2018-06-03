package com.witt.velocity;

import com.sun.tools.javac.util.Pair;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author witt
 * @fileName ExampleVelocity
 * @date 2018/6/3 00:52
 * <p>
 * @description </p>
 * @history <author>    <time>    <version>    <desc>
 */

public class ExampleVelocity {

    public String getString() {
        return "show velocity";
    }

    public List<String> list() {
        return Arrays.asList("dior", "lv", "boos", "Gucci");
    }

    public String whether(boolean whether) {
        if (whether) return "is true";
        return "is false";
    }

    public Map<Integer, Pair> map() {
        Map<Integer, Pair> map = new HashMap<>();
        Pair pair1 = Pair.of("a", "A");
        Pair pair2 = Pair.of("b", "B");
        Pair pair3 = Pair.of("c", "C");
        map.put(1, pair1);
        map.put(2, pair2);
        map.put(3, pair3);
        return map;
    }
}
