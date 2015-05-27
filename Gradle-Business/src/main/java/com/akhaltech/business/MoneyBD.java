package com.akhaltech.business;

import com.akhaltech.dao.repository.CustomerDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by vince on 2015-05-26.
 */
@Component
public class MoneyBD {
    private final Logger log = LoggerFactory.getLogger(MoneyBD.class);

    @Autowired
    private CustomerDao customerDao;

    public List<String> getMyMoneyList(String username) {
        log.info("MoneyBD.getMyMoneyList()");

        List<String> nameList = new ArrayList<String>();
        for(int i=0; i<5; i++) {
            nameList.add(username + i);
        }
        return nameList;
    }

    public void showCustomerCases() {
        customerDao.save();
        customerDao.find();
        customerDao.update();
        customerDao.find();
        customerDao.delete();
    }
}
