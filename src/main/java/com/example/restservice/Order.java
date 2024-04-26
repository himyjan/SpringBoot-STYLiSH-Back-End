package com.example.restservice;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
@Table(name = "Order")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Integer UserId;

    public String Time;

    public Integer Total;

    public String UserOrders;

    public Integer OrderId;

    public String PayOrders;

    public String Payment;

    public String Shipping;

    public Short Pay;

    public String OrderProducts;

    public String User;

    public String LastFour;
}
