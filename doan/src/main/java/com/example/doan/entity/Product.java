package com.example.doan.entity;
import jakarta.persistence.*;
@Entity
@Table(name = "product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;
    @Column(name="title")
    private String title;
    @Column(name="image")
    private String image;
    @Column(name="price")
    private float price;
    @Column(name="status")
    private int status;
    @Column(name="description")
    private String description;
//    @Column(name="id_cate")
//    private int id_cate;
    @Column(name="content")
    private String content;
    @Column(name="name")
    private String name;

    public Product() {
    }

    public Product(int id, String title, String image, float price, int status, String description, String content, String name) {
        this.id = id;
        this.title = title;
        this.image = image;
        this.price = price;
        this.status = status;
        this.description = description;
        this.content = content;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", image='" + image + '\'' +
                ", price=" + price +
                ", status=" + status +
                ", description='" + description + '\'' +
                ", content='" + content + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
