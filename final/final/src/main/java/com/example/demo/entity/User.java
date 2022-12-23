package com.example.demo.entity;

import jakarta.persistence.*;
import jakarta.persistence.ManyToOne;

import java.util.Collection;


@Entity
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "username")
    private String username;

    @Column(name = "pass")
    private String pass;

    public String getEmail() {
        return email;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    private String email;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }



    public User(Long id, String username, String pass, String email) {
        super();
        this.id = id;
        this.username = username;
        this.pass = pass;
        this.email = email;
    }

    public User(String username, String pass, String email) {
        super();
        this.username = username;
        this.pass = pass;
        this.email = email;
    }

    public User() {

    }

}
