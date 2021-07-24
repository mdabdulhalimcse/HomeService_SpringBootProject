package com.coderbd.entity;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.time.LocalDateTime;

@Data
@Entity
public class Notification {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String url;
    @ManyToOne
    @JoinColumn(nullable = false,name = "sender_id")
    private User sender;
    @ManyToOne
    @JoinColumn(nullable = false,name = "receipent_id")
    private User recipent;
    @Lob
    @NotEmpty(message = "Message can not empty!")
    @Size(min = 1,message = "Write at least 1 character!")
    private String message;
    private LocalDateTime sendingTime;
    private  LocalDateTime receiveTime;
    private boolean seenStatus;
}
