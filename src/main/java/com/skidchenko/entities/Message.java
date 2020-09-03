package com.skidchenko.entities;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Data
@EqualsAndHashCode
@ToString(exclude = {"sendTo", "sendBy"})
@NoArgsConstructor

@javax.persistence.Entity
@Table(name = "MESSAGES",schema = "public")
public class Message implements Serializable {

    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long Id;

    @Column(name = "user_id")
    private Long userId;

    @Column(name = "send_to_id")
    private Long sendToId;

    @Column(name = "title", length = 50)
    private String title;

    @Column(name = "message", length = 400)
    private String message;

    @Column(name = "creation_Date")
    private Date date;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "user_Id",insertable = false,updatable = false)
    private User sendBy;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "send_To_Id",insertable = false,updatable = false)
    private User sendTo;

    @Transient
    String from;

    @Transient
    String to;

//    @ManyToOne
//    @JoinColumns({
//            @JoinColumn(name = "user_id", referencedColumnName = "id"),
//            @JoinColumn(name = "send_to_id", referencedColumnName = "id")
//    })
//    private User user;

}
