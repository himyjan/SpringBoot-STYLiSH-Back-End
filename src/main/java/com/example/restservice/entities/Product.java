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

@Entity
@Table(name = "Product")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_Product", insertable = false, updatable = false)
    private Long id;

    private Long Id;

    private String Title;

    private String Description;

    private int Price;

    private String Texture;

    private String Wash;

    private String Place;

    private String Note;

    private String Story;

    private String MainImage;

    private String Category;
}