package com.example.restservice;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.io.Serializable;

@Entity
@Table(name = "Product")
public class Product implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long Id;

    public String Title;

    public String Description;

    public Integer Price;

    public String Texture;

    public String Wash;

    public String Place;

    public String Note;

    public String Story;

    public String MainImage;

    public String Category;
}
