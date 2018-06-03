package com.witt.velocity;

import com.witt.enums.Meal;
import org.junit.Test;

/**
 * @author witt
 * @fileName EnumTest
 * @date 2018/6/3 22:43
 * <p>
 * @description </p>
 * @history <author>    <time>    <version>    <desc>
 */


public class EnumTest {

    @Test
    public void fun1() {
        for (Meal meal : Meal.values()) {
            System.out.println(meal.name());
            for (Meal.Food value : meal.getValues()) {
                System.out.print(value+", ");
            }
            System.out.println();
        }
    }
}
