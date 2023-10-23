package com.volkov.springjwt.dtos;


import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class RegistrationUserDto {

   @NotBlank
   @Size(min =3, max = 20)
    private String username;

    @NotBlank
    @Size(min =3, max = 40)
    private String password;

    @NotBlank
    @Size(min =3, max = 40)
    private String confirmPassword;

    @NotBlank
    @Size(max = 50)
    @Email
    private String email;

}
