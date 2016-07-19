package com.example.attracti.customprogressbar;

/**
 * Created by Iryna on 7/19/16.
 */
public enum ProgressLineOrientation {
    HORIZONTAL(0), VERTICAL(1);

    int value;

    private ProgressLineOrientation(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
