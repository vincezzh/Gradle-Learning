package com.akhaltech.api.controller;

import com.akhaltech.api.model.Greeting;
import com.akhaltech.business.MoneyBD;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by vince on 2015-05-26.
 */
@RestController
@RequestMapping("/test")
public class GreetingController {

    @RequestMapping(value="/greeting", method = RequestMethod.GET)
    public Greeting greeting(@RequestParam(value="name", defaultValue="vince") String name) {
        MoneyBD bd = new MoneyBD();

        Greeting greeting = new Greeting();
        greeting.setName(name);
        greeting.setMoneyList(bd.getMyMoneyList(name));
        return greeting;
    }
}