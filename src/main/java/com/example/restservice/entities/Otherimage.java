package com.example.restservice.entities;

import com.example.restservice.entities.Product;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Column;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

@Entity
@Table(name = "Otherimage")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Otherimage {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_Otherimage", insertable = false, updatable = false)
    private Long id;

    private Long Id;

    private String ImagesUrl;

    @JdbcTypeCode(SqlTypes.JSON)
    private Product IdNavigation;
}
