package com.volkov.springjwt.dtos;


import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class JwtRequest {

    @NotBlank
    private String username;

    @NotBlank
    private String password;
}
