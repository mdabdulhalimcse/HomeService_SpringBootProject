package com.coderbd.entity;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

@Data
@Entity
public class Country {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String url;
    @NotEmpty(message = "Country can not empty")
    @Column(unique = true,nullable = false)
    private String name;
    @NotEmpty(message = "Country code can not empty")
    @Column(unique = true,nullable = false)
    private String code;
    private String flag;
    private String language;
}
