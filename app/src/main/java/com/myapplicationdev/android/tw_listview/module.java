package com.myapplicationdev.android.tw_listview;

public class module {
    private String name;
    private boolean isProgramming;
    public module(String name, boolean isProgramming) {
        this.name = name;
        this.isProgramming = isProgramming;
    }
    public String getName() {
        return name;
    }
    public boolean isProgramming() {
        return isProgramming;
    }
}
