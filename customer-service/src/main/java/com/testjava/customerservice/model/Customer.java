package com.testjava.customerservice.model;

import lombok.*;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "Customer")
public class Customer {

    @Id
    @Column
    private String customerId;
    @Column
    private String customerName;
    @Column
    private String customerPhone;
    @Column
    private String customerEmail;

    @Column
    private String customerPermanentAddress;
    @Column
    private String customerIdentityDocument;



}
