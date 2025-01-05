package com.example.yari.entities;

import jakarta.persistence.*;
@Entity

public class Contact {
    private String id;
    private String name;
    private String email;
    private String phone;
    private String address;
    private String picture;
    private String description;
    private String socialmedialink;
    private boolean favourite=false;

    @ManyToOne
    private User user;

}
