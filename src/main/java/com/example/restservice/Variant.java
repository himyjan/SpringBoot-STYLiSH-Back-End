package com.example.restservice;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

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
