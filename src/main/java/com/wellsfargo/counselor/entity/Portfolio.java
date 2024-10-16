package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Portfolio {
    @Id
    @GeneratedValue()
    private long portfolioId;
    @OneToMany
    @JoinColumn(name = "clientId", nullable = false)
    private Client client;

    @Column(nullable = false)
    private LocalDate createDate;

    protected Portfolio() {

    }

    public Portfolio(Client client, LocalDate createDate) {
        this.client = client;
        this.createDate = createDate;
    }

    public long getPortfolioId() {
        return portfolioId;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public LocalDate getCreationDate() {
        return createDate;
    }

    public void setCreationDate(LocalDate creationDate) {
        this.createDate = creationDate;
    }
}

