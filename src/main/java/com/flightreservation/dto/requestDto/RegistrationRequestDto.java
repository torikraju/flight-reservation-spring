package com.flightreservation.dto.requestDto;

import lombok.Data;

@Data
public class RegistrationRequestDto {

    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String confirmPassword;

}
