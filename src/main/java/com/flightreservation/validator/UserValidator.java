package com.flightreservation.validator;

import com.flightreservation.bean.Translator;
import com.flightreservation.dto.requestDto.RegistrationRequestDto;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;
import org.springframework.context.MessageSource;

@Component
public class UserValidator implements Validator {

    private final MessageSource messageSource;

    public UserValidator(MessageSource messageSource) {
        this.messageSource = messageSource;
    }

    @Override
    public boolean supports(Class<?> aClass) {
        return RegistrationRequestDto.class.equals(aClass);
    }

    @Override
    public void validate(Object object, Errors errors) {
        RegistrationRequestDto requestDto = (RegistrationRequestDto) object;
        if (requestDto.getPassword().length() < 6) {
            errors.rejectValue("password", "Length", Translator.toLocale("password.length"));
        }
        if (!requestDto.getPassword().equals(requestDto.getConfirmPassword())) {
            errors.rejectValue("confirmPassword", "Match", "Password must match");
        }
    }
}
