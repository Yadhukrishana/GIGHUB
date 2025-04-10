package com.Yadhu.GIGHUB.auth;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RegisterRequest {


    private String name;
    private String phone;
    private String email;
    private String password;
    private String place;

}
