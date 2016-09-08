package com.example.view;

import com.example.utils.FormValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * Backing bean for registration example.
 *
 * Created by Jakub Tucek on 07.09.2016.
 */
@Component
@Scope("session")
public class RegistrationBean {
    private String firstName, lastName, emailAddress;

    private final FormValidator formValidator;

    @Autowired
    public RegistrationBean(FormValidator formValidator) {
        this.formValidator = formValidator;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String doRegistration() {
        if (formValidator.areStringsValid(firstName,lastName, emailAddress)) {
            return "registration-success?faces-redirect=true";
        } else {
            return "registration-error?faces-redirect=true";
        }
    }
}
