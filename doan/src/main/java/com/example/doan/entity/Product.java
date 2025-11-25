package com.example.doan.entity;
import jakarta.persistence.*;
@Entity
@Table(name = "product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;
    @Column(name="name")
    private String name;
    @Column(name="image")
    private String image;
    @Column(name="price")
    private double price;
    @Column(name="description")
    private String description;
    @Column(name="status")
    private int status;
    @Column(name="category_id")
    private int category_id;


}
