package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Client {

    @Id
    @GeneratedValue()
    private long clientId;

    @ManyToOne
    @JoinColumn(name = "advisor_ID")
    private Advisor advisor;

    @Column(nullable = false)
    private String C_firstName;

    @Column(nullable = false)
    private String C_lastName;

    @Column(nullable = false)
    private String C_address;

    @Column(nullable = false)
    private String C_phone;

    @Column(nullable = false)
    private String C_email;

    @OneToMany(mappedBy = "client", cascade = CascadeType.ALL)
    private List<Portfolio> portfolios;

    protected Client(){}

    public Client (String c_firstName, String c_lastName, String c_address, String c_phone, String c_email) {
        this.C_firstName = c_firstName;
        this.C_lastName = c_lastName;
        this.C_address = c_address;
        this.C_phone = c_phone;
        this.C_email = c_email;
    }

    public long getClientId() {
        return clientId;
    }

    public Advisor getAdvisor() {
        return advisor;
    }

    public void setAdvisor(Advisor advisor) {
        this.advisor = advisor;
    }

    public String getC_firstName() {
        return C_firstName;
    }

    public void setC_firstName(String c_firstName) {
        C_firstName = c_firstName;
    }

    public String getC_lastName() {
        return C_lastName;
    }

    public void setC_lastName(String c_lastName) {
        C_lastName = c_lastName;
    }

    public String getC_address() {
        return C_address;
    }

    public void setC_address(String c_address) {
        C_address = c_address;
    }

    public String getC_phone() {
        return C_phone;
    }

    public void setC_phone(String c_phone) {
        C_phone = c_phone;
    }

    public String getC_email() {
        return C_email;
    }

    public void setC_email(String c_email) {
        C_email = c_email;
    }
}
