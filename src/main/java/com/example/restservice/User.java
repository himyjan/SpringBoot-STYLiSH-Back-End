package com.example.restservice;

import jakarta.persistence.Entity;

@Entity
@Table(name = "User")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int Id;

    public String Provider;

    public String Name;

    public String Email;

    public String Picture;

    public String Password;
}
