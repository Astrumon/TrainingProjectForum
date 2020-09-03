package com.skidchenko.entities;

import com.skidchenko.LogicLayer.Forms.UserForm;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Data
@EqualsAndHashCode(exclude = {"notes","sent","received"})
@NoArgsConstructor
@AllArgsConstructor
@ToString(exclude = "notes")

@Builder

@javax.persistence.Entity
@Table(name = "USERS",schema = "public")
public class User implements Serializable {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nickname",unique = true,updatable = false)
    private String nickname;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "password")
    private String password;

    @Column(name = "email",unique = true)
    private String email;

@OneToMany(mappedBy = "user",fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    private Set<Note> notes = new HashSet<Note>();

@OneToMany(mappedBy = "sendBy",fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    private Set<Message> sent = new HashSet<Message>();

    @OneToMany(mappedBy = "sendTo",fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    private Set<Message> received = new HashSet<Message>();


    public static User from (UserForm userForm) {
        return User.builder()
                .email(userForm.getEmail())
                .firstName(userForm.getFirstName())
                .lastName(userForm.getLastName())
                .nickname(userForm.getNickname())
                .password(userForm.getPassword())
                .build();
    }


//    @OneToMany(mappedBy = "user")
//    private Set<Message> incomingMessages;
//
//    @OneToMany(mappedBy = "user")
//    private Set<Message> upcomingMessages;
}
