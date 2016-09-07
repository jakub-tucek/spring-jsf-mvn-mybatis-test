package com.example.user.bo;

import org.springframework.stereotype.Service;

/**
 * Created by Jakub Tucek on 07.09.2016.
 */
@Service
public class UserBoImpl implements UserBo {
    public String getMessage() {
        return "JSF + Spring";
    }
}
