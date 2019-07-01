package com.bruce.type;

/**
 * @Author: Bruce
 * @Date: 2019/6/29 17:12
 * @Version 1.0
 */
public enum Enabled {

    enabled(1), // enable
    disabled(0); // disable

    private final int value;

    private Enabled(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
