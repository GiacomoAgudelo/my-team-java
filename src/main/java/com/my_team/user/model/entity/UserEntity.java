package com.my_team.user.model.entity;

import lombok.Data;

import java.util.Date;

@Data
public class UserEntity {

    private Long id;
    private Long group_id;
    private String type;
    private String user_name;
    private String first_name;
    private String middle_name;
    private String last_name;
    private String sex;
    private String email;
    private String password;
    private String password_salt;
    private Date date_birth;
    private Date create_at;//timestamp
    private Date Update_At;//timestamp
}
