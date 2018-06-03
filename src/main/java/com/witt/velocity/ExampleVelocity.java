package com.witt.velocity;

import java.util.*;

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

class Pair<A, B> {
    public final A fst;
    public final B snd;

    public Pair(A var1, B var2) {
        this.fst = var1;
        this.snd = var2;
    }

    public String toString() {
        return "Pair[" + this.fst + "," + this.snd + "]";
    }

    public boolean equals(Object var1) {
        return var1 instanceof Pair && Objects.equals(this.fst, ((Pair)var1).fst) && Objects.equals(this.snd, ((Pair)var1).snd);
    }

    public int hashCode() {
        if (this.fst == null) {
            return this.snd == null ? 0 : this.snd.hashCode() + 1;
        } else {
            return this.snd == null ? this.fst.hashCode() + 2 : this.fst.hashCode() * 17 + this.snd.hashCode();
        }
    }

    public static <A, B> Pair<A, B> of(A var0, B var1) {
        return new Pair(var0, var1);
    }
}
