package com.example.restservice;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
@Table(name = "Otherimage")
public class Otherimage {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public String ImagesUrl;

    public Long Id;

    public Product IdNavigation;
}
