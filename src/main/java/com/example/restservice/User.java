package com.example.restservice;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
@Table(name = "User")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Integer Id;

    public String Provider;

    public String Name;

    public String Email;

    public String Picture;

    public String Password;
}
