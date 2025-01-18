package com.curd.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.Data;


@Entity
@Data
@Table(name ="employees")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonProperty
    private Long id;

    @JsonProperty("first_name")
    @Column(name = "first_name", nullable = false, length = 100)
    private String firstName;

    @JsonProperty("last_name")
    @Column(name = "last_name", nullable = false, length = 100)
    private String lastname;

    @JsonProperty
    @Column(nullable = false, unique = true, length = 150)
    private String email;

    @JsonProperty
    @Column(length = 15)
    private String phone;

    @JsonProperty
    @Column(length = 200)
    private String address;

    @JsonProperty
    @Column(length = 50)
    private String city;

    @JsonProperty
    @Column(length = 50)
    private String state;

    @JsonProperty("postal_code")
    @Column(name = "postal_code", length = 10)
    private String postalcode;

    @JsonProperty
    @Column(nullable = false)
    private double salary;

    @JsonProperty
    @Column(length = 50)
    private String department;

    @JsonProperty
    @Column(length = 50)
    private String position;




}
