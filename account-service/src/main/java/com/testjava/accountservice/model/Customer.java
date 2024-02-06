package com.testjava.accountservice.model;

import lombok.*;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Customer {
    private String customerId;

    private String customerName;

    private String customerPhone;

    private String customerEmail;

    private String customerPermanentAddress;

    private String customerIdentityDocument;

}
