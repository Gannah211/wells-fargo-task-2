package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
public class Portfolio {

    @Id
    @GeneratedValue()
    private long portfolioId;


    @ManyToOne
    @JoinColumn(name = "client_ID")
    private Client client;

    @Column(nullable = false)
    private Date creationDate;

    @OneToMany(mappedBy = "portfolio", cascade = CascadeType.ALL)
    private List<Security> securities;

    protected Portfolio(){}

    public Portfolio(Date creationDate){
        this.creationDate =creationDate;
    }

    public long getPortfolioId() {
        return portfolioId;
    }


    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
}
