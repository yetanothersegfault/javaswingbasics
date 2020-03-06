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

    public Customer(String firstName, String lastName) {
        first_name = firstName;
        last_name = lastName;
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
        return first_name;
    }
}
