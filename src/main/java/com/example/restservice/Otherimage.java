package com.example.restservice;

import jakarta.persistence.Entity;

@Entity
@Table(name = "Otherimage")
public class Otherimage {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public String ImagesUrl;

    public Long Id;

    public Product IdNavigation;
}
