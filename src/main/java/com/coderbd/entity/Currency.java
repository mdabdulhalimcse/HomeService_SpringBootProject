package com.coderbd.entity;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

@Data
@Entity
public class Currency {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String url;
    @NotEmpty(message = "Currency can not empty")
    @Column(unique = true,nullable = false)
    private String currency;

}
