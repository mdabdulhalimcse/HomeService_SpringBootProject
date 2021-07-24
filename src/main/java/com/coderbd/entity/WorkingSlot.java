package com.coderbd.entity;

import com.coderbd.enums.Week;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalTime;

@Data
@Entity
public class WorkingSlot {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String url;
    private LocalTime startTime;
    private LocalTime endTime;
    private int noOfhours;
    private Week day;
    @ManyToOne
    @JoinColumn(nullable = false,name = "user_id")
    private User user;
}
