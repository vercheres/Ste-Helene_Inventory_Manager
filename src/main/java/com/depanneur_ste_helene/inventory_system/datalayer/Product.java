package com.depanneur_ste_helene.inventory_system.datalayer;
import javax.persistence.*;

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer productId;
    private Integer barCode;
    private String productName;
    private String brand;
    private double price;
    private Integer quantity;
    private Integer quantitySold;
    private Integer categoryId;

    public Product(Integer productId, Integer barCode, String productName, String brand, double price, Integer quantity, Integer quantitySold, Integer categoryId) {
        this.productId = productId;
        this.barCode = barCode;
        this.productName = productName;
        this.brand = brand;
        this.price = price;
        this.quantity = quantity;
        this.quantitySold = quantitySold;
        this.categoryId = categoryId;
    }

    public Product() {

    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Integer getBarCode() {
        return barCode;
    }

    public void setBarCode(Integer barCode) {
        this.barCode = barCode;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Integer getQuantitySold() {
        return quantitySold;
    }

    public void setQuantitySold(Integer quantitySold) {
        this.quantitySold = quantitySold;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }
}