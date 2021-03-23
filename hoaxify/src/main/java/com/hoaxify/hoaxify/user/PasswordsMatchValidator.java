package com.hoaxify.hoaxify.user;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class PasswordsMatchValidator implements ConstraintValidator<PasswordsMatch,User>{

    @Override
    public boolean isValid(User value, ConstraintValidatorContext context) {
        /*
        if(value.getPassword().equals(value.getPasswordRepeat())) {
            return true;
        }
        */
        return false;
    }

}
