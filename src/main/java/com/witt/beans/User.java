package com.witt.beans;

/**
 * @author witt
 * @fileName User
 * @date 2018/6/3 23:12
 * <p>
 * @description </p>
 * @history <author>    <time>    <version>    <desc>
 */

public class User {
    private Integer id;
    private String name;

    public User() {
    }

    public User(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public User(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static User of(String name) {
        return new User(name);
    }
}
