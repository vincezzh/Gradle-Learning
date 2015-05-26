package com.akhaltech.dao.repository;

import com.akhaltech.dao.model.Customer;
import com.mongodb.WriteResult;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

/**
 * Created by vince on 2015-05-26.
 */
@Repository
public class CustomerDaoImpl implements CustomerDao {
    @Resource
    private MongoTemplate mongoTemplate;

    @Override
    public void save() {
        mongoTemplate.insert(new Customer("Alice", "Smith"));
    }

    @Override
    public void find() {
        Query query = new Query(Criteria.where("firstName").is("Alice"));
        Customer customer = this.mongoTemplate.findOne(query, Customer.class);
        System.out.println(customer);
    }

    @Override
    public void update() {
        Query query = new Query(Criteria.where("firstName").is("Alice"));
        Update update = new Update().set("lastName", "John");
        WriteResult result = this.mongoTemplate.updateFirst(query, update, Customer.class);
        System.out.println(result);
    }

    @Override
    public void delete() {
        Query query = new Query(Criteria.where("firstName").is("Alice"));
        Customer customer = this.mongoTemplate.findOne(query, Customer.class);
        WriteResult result = this.mongoTemplate.remove(customer);
        System.out.println(result);
    }
}
