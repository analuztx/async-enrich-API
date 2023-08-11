package com.desafiotres.compass.entity;

import com.desafiotres.compass.converter.PostStatusConverter;
import com.desafiotres.compass.enums.PostStatus;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Convert;


import lombok.Data;

@Data
@Entity
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "title")
    private String title;

    @Column(name = "body")
    private String body;

    @Convert(converter = PostStatusConverter.class)
    @Column(name = "state")
    private PostStatus state;
}
