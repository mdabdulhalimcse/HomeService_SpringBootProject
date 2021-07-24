package com.coderbd.entity;

import com.coderbd.enums.AvailityStatus;
import com.coderbd.enums.Gender;
import com.coderbd.enums.NotificationStatus;
import com.coderbd.enums.UserStatus;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Data
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String url;
    private String fullName;
    private String username;
    private AvailityStatus availityStatus;
    private String password;
    private String photoUrl;
    private String email;
    private String nationalId;
    private String bloodGroup;
    private String mobile;
    private String mobileVerficationCode;
    private String mobileVerficationStatus;
    private String landPhone;
    private String lat;
    private String lon;
    private String ip;
    @ManyToOne
    private City city;
    private String browserName;
    private String browserVersion;
    private String device;
    private String os;
    private Gender gender;
    private String biography;
    private LocalDate birthDate;
    private LocalDateTime joiningTime;
    private UserStatus status;
    private  double rating;
    @ManyToMany
    private List<Role> roles;
    private NotificationStatus notificationStatus;
}
