package com.testjava.accountservice.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;


@Entity
@Table(name="Account")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Account {
    @Id
    private String accountId;

    private String accountType;

    @DateTimeFormat
    Date accountOpeningDate;

    @DateTimeFormat
    Date lastActivity;
    private int balance;

    private String customerId;

    @Transient
    Customer customer;
}
