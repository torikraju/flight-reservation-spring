package com.flightreservation.resource;

import com.flightreservation.annotation.ApiController;
import com.flightreservation.bean.Translator;
import com.flightreservation.dto.requestDto.RegistrationRequestDto;
import com.flightreservation.serviceImpl.MapValidationErrorService;
import com.flightreservation.validator.UserValidator;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import javax.validation.Valid;

@ApiController
public class UserController {

    private final UserValidator userValidator;
    private final MapValidationErrorService errorService;

    public UserController(UserValidator userValidator, MapValidationErrorService errorService) {
        this.userValidator = userValidator;
        this.errorService = errorService;
    }

    @PostMapping("/register")
    public ResponseEntity<?> register(@Valid @RequestBody RegistrationRequestDto requestDto, BindingResult result) {
        userValidator.validate(requestDto, result);
        ResponseEntity<?> errorMap = errorService.mapValidationService(result);
        if (errorMap != null) return errorMap;
//        User newUser = userService.saveUser(user);

        return new ResponseEntity<>(Translator.toLocale("password.length"), HttpStatus.CREATED);
    }

}
