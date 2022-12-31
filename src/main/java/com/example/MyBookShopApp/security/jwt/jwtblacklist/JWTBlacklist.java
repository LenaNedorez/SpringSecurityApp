package com.example.MyBookShopApp.security.jwt.jwtblacklist;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class JWTBlacklist {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    private String token;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    @Override
    public String toString() {
        return "JWTBlacklist{" +
                "id='" + id + '\'' +
                ", token='" + token + '\'' +
                '}';
    }
}
