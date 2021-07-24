package com.coderbd.entity;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

@Entity
public class Skills {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String url;
    @NotEmpty(message = "Title can not be empty!")
    @Column(unique = true,nullable = false)
    private String title;
    private boolean status;
}
