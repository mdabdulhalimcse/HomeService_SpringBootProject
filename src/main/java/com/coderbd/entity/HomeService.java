package com.coderbd.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Data
@Entity
public class HomeService {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String url;
    private String weeklyHours;
    @ManyToMany
    private Set<WorkingSlot> slots;
    @ManyToMany
    private Set<Skills> skills;
    private byte yearIfExperience;
    private double hourlyRate;
    @ManyToOne
    private Currency currency;
    private boolean negotiateAble;
    @ManyToMany
    private List<City> cities;
    private short workingDistance;
    // Sat-9-12 and 6-10
    // Sun-> 7-10
    // Specific Skills-> Wiring, Cirkit Ready
    // Experience-> 5 years
    // Rating ->
    // Payment-> Per Hour rate 10-15 USD OR 20 USD
    // Is Negotiatable? -> CheckBox Yes / No
    // Service Selling Location -> Country->State->District->City->LAT/LON
    // Working SoundDistance : 10 KM
    //

    @ManyToOne
    @JoinColumn(name = "st_id", nullable = false)
    private ServiceType serviceType;
    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;
}
