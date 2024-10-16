package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

import java.time.LocalDate;


@Entity

public class Security {
    @Id
    @GeneratedValue()
    private long securityId;
    @ManyToOne
    @JoinColumn(name = "portfolioId", nullable = false)
    private  Portfolio portfolio;
    private String name;
    private String category;
    private String purchasePrice;
    private LocalDate purchaseDate;
    private String quantity;

    protected Security() {

    }

    public Security(Portfolio portfolio, String name, String category, String purchasePrice, LocalDate purchaseDate, String quantity) {
        this.portfolio = portfolio;
        this.name = name;
        this.category = category;
        this.purchasePrice = purchasePrice;
        this.purchaseDate = purchaseDate;
        this.quantity = quantity;
    }

    public long getSecurityId() {
        return securityId;
    }

    public Portfolio getPortfolio() {
        return portfolio;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(String purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public LocalDate getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(LocalDate purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

}
