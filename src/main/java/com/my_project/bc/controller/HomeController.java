package com.my_project.bc.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping(value = "/home")
    public String login(Model model) {
        String data = "테스트";
        System.out.println("login 홈페이지 진입");
        return data;
    }
}
