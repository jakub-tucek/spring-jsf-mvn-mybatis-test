package com.example.domain.user;

import org.springframework.stereotype.Service;

/**
 * Created by Jakub Tucek on 07.09.2016.
 */
@Service
public class UserServiceExample implements UserService {
    public String getMessage() {
        return "JSF + Spring";
    }
}
