package com.my_team.user.model.dto;

import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import java.util.Date;

@Data
public class UserCreateRequestDto {

    private String type; //è possibile inserire questo dato nel db?
    @NotBlank(message = "Username is mandatory")
    private String user_name;
    private String first_name;
    private String middle_name;
    private String last_name;
    private String sex; //potrebbe essere un enum
    @Email(message = "Email should be valid")
    private String email;
    @NotBlank(message = "Password is mandatory")
    private String password;
    @NotBlank
    private Date date_birth;
}
