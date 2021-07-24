package com.coderbd.entity;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

@Data
@Entity
public class ServiceType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotEmpty(message = "Title Can not empty!")
    @Column(unique = true, nullable = false)
    private String title;// Electronics, Electricity, Plumbing etc
    @Column(unique = true, nullable = false)
    private String url;
    @Column(nullable = false)
    private String iconUrl;
    @NotEmpty(message = "Description can not empty")
    @Lob
    private String description;
}
