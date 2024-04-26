package com.example.restservice;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
@Table(name = "Campaign")
public class Campaign {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long ProductId;

    public String Picture;

    public String Story;

    protected Campaign() {
    }

    public Campaign(Long ProductId, String Picture, String Story) {
        this.ProductId = ProductId;
        this.Picture = Picture;
        this.Story = Story;
    }

    public Long getProductId() {
        return ProductId;
    }

    public String getPicture() {
        return Picture;
    }

    public String getStory() {
        return Story;
    }
}
