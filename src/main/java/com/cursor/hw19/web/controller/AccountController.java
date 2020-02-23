package com.cursor.hw19.web.controller;

import com.cursor.hw19.service.impl.AccountServiceImpl;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Component
@RestController
@CrossOrigin
//@RequestMapping("/api/accounts")
@AllArgsConstructor
@NoArgsConstructor
public class AccountController {
    @Autowired
    private AccountServiceImpl accountService;

//    @GetMapping("/")
    @Autowired
    public void runApp() {
        System.err.println("TEST    TEST    TEST");

        accountService.findByFirstName("Mac");
    }
}
