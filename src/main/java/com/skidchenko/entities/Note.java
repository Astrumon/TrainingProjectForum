package com.skidchenko.entities;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Data
@EqualsAndHashCode
@NoArgsConstructor
@ToString

@javax.persistence.Entity
@Table(name = "notes",schema = "public")
public class Note implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    Long Id;

    @Column(name = "user_Id",updatable = false)
    Long userId;

    @Column(name = "title", length = 50,updatable = false)
    String title;

    @Column(name = "text", length = 1000,updatable = false)
    String text;

    @Column(name = "creation_date",updatable = false)
    Date creationDate;

    @ManyToOne(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    @JoinColumn(name = "user_Id", insertable = false, updatable = false)
    public User user;


}
