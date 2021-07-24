package com.coderbd.entity;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

@Data
@Entity
public class State {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String url;
    @NotEmpty(message = "Name can not empty")
    @Column(unique = true,nullable = false)
    private String name;
    @ManyToOne
    private Country country;
}
