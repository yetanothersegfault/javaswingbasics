package com.example.accessingdatamysql;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Customer
{
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private String first_name;
    private String last_name;

    protected Customer() {}

    public Customer(String first_name, String last_name) {
        this.first_name = first_name;
        this.last_name = last_name;
    }

    @Override
    public String toString() {
        return String.format(
                "Customer[id=%d, firstName='%s', lastName='%s']\n",
                id, first_name, last_name);
    }

    public Long getId() {
        return id;
    }

    public String getFirstName() {
        return first_name;
    }

    public String getLastName() {
        return last_name;
    }
}
