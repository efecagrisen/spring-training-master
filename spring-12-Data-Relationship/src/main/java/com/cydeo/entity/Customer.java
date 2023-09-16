package com.cydeo.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "customers")
@Data
@NoArgsConstructor
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String surName;
    private String userName;
    private String email;
    private String address;

    @OneToMany (mappedBy = "customer")
    private List<Payment> paymentList;

    public Customer(String name, String surName, String userName, String email, String address) {
        this.name = name;
        this.surName = surName;
        this.userName = userName;
        this.email = email;
        this.address = address;
    }
}
