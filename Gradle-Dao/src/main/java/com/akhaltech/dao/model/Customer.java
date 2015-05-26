package com.akhaltech.dao.model;

import org.springframework.data.annotation.Id;

/**
 * Created by vince on 2015-05-26.
 */
public class Customer {
    @Id
    private String id;

    private String firstName;
    private String lastName;

    public Customer() {}

    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return String.format(
                "Customer[id=%s, firstName='%s', lastName='%s']",
                id, firstName, lastName);
    }
}
