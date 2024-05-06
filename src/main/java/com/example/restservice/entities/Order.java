package com.example.restservice.entities;

import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Column;

@Entity(name = "\"Order\"")
@Table(name = "\"Order\"")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_Order", insertable = false, updatable = false)
    private Long id;

    private int UserId;

    private String Time;

    private int Total;

    private String UserOrders;

    private int OrderId;

    private String PayOrders;

    private String Payment;

    private String Shipping;

    private Short Pay;

    private String OrderProducts;

    private String User;

    private String LastFour;
}