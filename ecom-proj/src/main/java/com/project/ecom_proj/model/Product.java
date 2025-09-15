package com.project.ecom_proj.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    private String name;
    private String brand;
    private String desc;
    private BigDecimal price;
    private Date releaseDate;
    private String category;
    private int quantity;
    private boolean available;

    private String imageName;
    private String imageType;
    @Lob
    private byte[] imageData;
}
