package com.testjava.customerservice.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Account {


    private String accountId;
    private String accountType;
    Date accountOpeningDate;
    Date lastActivity;
    private int balance;
    private String customerId;
    Customer customer;

}
