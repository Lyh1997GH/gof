package com.gof.adapter;

/**
 * 实际情况 交流100伏特
 */
public class Banner {

    private String title;

    public Banner(String title) {
        this.title = title;
    }

    public void showWithParen(){
        System.out.println("(" + this.title + ")");
    }

    public void showWithAster(){
        System.out.println("*" + this.title + "*");
    }
}
