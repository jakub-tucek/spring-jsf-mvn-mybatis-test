package com.example.utils;

import org.springframework.stereotype.Service;

/**
 * Util for generic form validating
 * Created by Jakub Tucek on 07.09.2016.
 */
@Service
public class FormValidator {

    public boolean areStringsValid(String... parameters) {
        for (String p : parameters) {
            if (p == null || p.matches("^\\s*$")) return false;
        }
        return true;
    }

}
