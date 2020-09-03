package com.skidchenko.LogicLayer.Forms;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class UserForm {
    private int id;
    private String nickname;
    private String firstName;
    private String lastName;
    private String email;
    private String password;

}
