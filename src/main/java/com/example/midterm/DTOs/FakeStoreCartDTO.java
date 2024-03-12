package com.example.midterm.DTOs;

public class FakeStoreCartDTO {
    private Long id;
    private String name;
    private String description;
    private Double price;
    private String image;
    private Long userId;
    private Long productId;

    public FakeStoreCartDTO() {
    }

    public FakeStoreCartDTO(Long id, String name, String description, Double price, String image, Long userId, Long productId) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.image = image;
        this.userId = userId;
        this.productId = productId;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Double getPrice() {
        return price;
    }

    public String getImage() {
        return image;
    }

    public Long getUserId() {
        return userId;
    }

    public Long getProductId() {
        return productId;
    }
}
