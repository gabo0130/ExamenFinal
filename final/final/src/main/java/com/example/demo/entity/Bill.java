package com.example.demo.entity;

import jakarta.persistence.*;
import  jakarta.persistence.ManyToOne;

import java.sql.Timestamp;

@Entity
@Table(name = "bill")
public class Bill {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;



    @Column(name = "date_bill")
    private Timestamp date_bill;
    @Column(name = "user_id")
    private String user_id;

    @Column(name = "value")
    private int value;

    @Column(name = "type")
    private int type;
    @Column(name = "observation")
    private String observation;

    @ManyToOne
    @JoinColumn(name="user_id")
    private User user;

    public Bill(Timestamp date_bill, String user_id, int value, int type, String observation) {

        this.date_bill = date_bill;
        this.user_id = user_id;
        this.value = value;
        this.type = type;
        this.observation = observation;
    }

    public Bill(Long id, Timestamp date_bill, String user_id, int value, int type, String observation) {
        this.id = id;
        this.date_bill = date_bill;
        this.user_id = user_id;
        this.value = value;
        this.type = type;
        this.observation = observation;
    }

}
