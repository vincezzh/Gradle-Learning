package com.akhaltech.api.model;

import java.util.List;

/**
 * Created by vince on 2015-05-26.
 */
public class Greeting {
    private String name;
    private List<String> moneyList;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getMoneyList() {
        return moneyList;
    }

    public void setMoneyList(List<String> moneyList) {
        this.moneyList = moneyList;
    }
}
