package com.witt.velocity;

import com.witt.beans.User;

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

    public List<User> list() {
        return Arrays.asList(User.of("dior"), User.of("Gucci"), User.of("boos"));
    }

}