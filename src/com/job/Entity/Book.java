package com.job.Entity;

/**
 * id 图书名 分类名 价格 描述
 */
public class Book {
    private String id;
    private String name;
    private String catgory;
    private double price;
    private String description;

    public Book() {
    }

    public Book(String id, String name, String catgory, double price, String description) {
        this.id = id;
        this.name = name;
        this.catgory = catgory;
        this.price = price;
        this.description = description;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCatgory() {
        return catgory;
    }

    public void setCatgory(String catgory) {
        this.catgory = catgory;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", catgory='" + catgory + '\'' +
                ", price=" + price +
                ", description='" + description + '\'' +
                '}';
    }
}
