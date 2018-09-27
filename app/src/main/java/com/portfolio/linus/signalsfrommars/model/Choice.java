package com.portfolio.linus.signalsfrommars.model;

/**
 * Created by Johan on 2018-09-24.
 */

public class Choice {

    private int textId;
    private  int nextPage;



    public Choice(int textId, int nextPage) {
        this.textId = textId;
        this.nextPage = nextPage;
    }

    public int getTextId() {
        return textId;
    }

    public void setTextId(int textId) {
        this.textId = textId;
    }

    public int getNextPage() {
        return nextPage;
    }

    public void setNextPage(int nextPage) {
        this.nextPage = nextPage;
    }
}
