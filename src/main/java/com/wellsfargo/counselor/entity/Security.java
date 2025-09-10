package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table( name = "security")
public class Security {


    @Id
    @GeneratedValue()
    private long securityId;

    @ManyToOne
    @JoinColumn(name = "portfolioId", nullable = false)
    private Portfolio portfolio;

    @Column(nullable = false)
    private String  S_name;

    @Column(nullable = false)
    private String  S_category;

    @Column(nullable = false)
    private double  S_purchasePrice;

    @Column(nullable = false)
    private Date  S_purchaseDate;

    @Column(nullable = false)
    private int  S_quantity;

//    protected Security(){}


    public Security(Portfolio portfolio, String s_name, String s_category, Date s_purchaseDate, double s_purchasePrice, int s_quantity) {
        this.portfolio = portfolio;
        S_name = s_name;
        S_category = s_category;
        S_purchaseDate = s_purchaseDate;
        S_purchasePrice = s_purchasePrice;
        S_quantity = s_quantity;
    }

    public long getSecurityId() {
        return securityId;
    }

    public Portfolio getPortfolio() {
        return portfolio;
    }

    public void setPortfolio(Portfolio portfolio) {
        this.portfolio = portfolio;
    }

    public String getS_name() {
        return S_name;
    }

    public void setS_name(String s_name) {
        S_name = s_name;
    }

    public String getS_category() {
        return S_category;
    }

    public void setS_category(String s_category) {
        S_category = s_category;
    }

    public double getS_purchasePrice() {
        return S_purchasePrice;
    }

    public void setS_purchasePrice(double s_purchasePrice) {
        S_purchasePrice = s_purchasePrice;
    }

    public Date getS_purchaseDate() {
        return S_purchaseDate;
    }

    public void setS_purchaseDate(Date s_purchaseDate) {
        S_purchaseDate = s_purchaseDate;
    }

    public int getS_quantity() {
        return S_quantity;
    }

    public void setS_quantity(int s_quantity) {
        S_quantity = s_quantity;
    }
}
