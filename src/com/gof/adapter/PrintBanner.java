package com.gof.adapter;

public class PrintBanner extends Banner implements Print {

    public PrintBanner(String title) {
        super(title);
    }

    @Override
    public void printWeek() {
        showWithParen();
    }

    @Override
    public void printStrong() {
        showWithAster();
    }
}
