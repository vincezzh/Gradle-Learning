package com.akhaltech.business;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by vince on 2015-05-26.
 */
public class MoneyBD {
    private final Logger log = LoggerFactory.getLogger(MoneyBD.class);

    public List<String> getMyMoneyList(String username) {
        log.info("MoneyBD.getMyMoneyList()");

        List<String> nameList = new ArrayList<String>();
        for(int i=0; i<5; i++) {
            nameList.add(username + i);
        }
        return nameList;
    }
}
