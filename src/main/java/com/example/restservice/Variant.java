package com.example.restservice;

import jakarta.persistence.Entity;

@Entity
@Table(name = "Variant")
public class Variant {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public String ColorCode;

    public String Size;

    public Int Stock;

    public Long Id;

    public String ColorName;
}
