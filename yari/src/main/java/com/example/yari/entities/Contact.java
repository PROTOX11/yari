package com.example.yari.entities;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

import java.util.*;
@Entity

public class Contact {
    @Id
    private String id;
    private String name;
    private String email;
    private String phone;
    private String address;
    private String picture;
    @Column(length  = 1000)
    private String description;
    private String socialmedialink;
    private boolean favourite=false;

    private List<String> socailaLinks=new ArrayList<>();
    private String websiteLink;

    @ManyToOne
    private User user;
    @OneToMany(mappedBy = "contact", cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    private List<SocialLink> socialLinks = new ArrayList<>();
}
