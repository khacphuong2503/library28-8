package com.javatechie.dto;

import lombok.Data;
import org.springframework.validation.annotation.Validated;


@Data
@Validated
public class UserInfoDTO {

    private String name;

    private String password;

    private String phoneNumber;

    private String email;
}