package com.crossword;

import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.*;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.security.sasl.AuthenticationException;

import static java.util.Arrays.asList;

@Controller
public class AuthController {

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public User login(@RequestParam("username") String username, @RequestParam("password")  String password) throws AuthenticationException {
        System.out.println(username + " / " + password);
        if (!username.equals("vasa") && !password.equals("vasa")) throw new AuthenticationException();
        org.springframework.security.core.userdetails.User user = new User(username,password, asList(new SimpleGrantedAuthority("USER")));
        return user;
    }
}
