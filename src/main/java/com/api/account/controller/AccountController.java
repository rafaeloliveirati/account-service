package com.api.account.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("accounts")
public class AccountController {
    @GetMapping
    public String Get() {
        return "Hello World";
    }

}