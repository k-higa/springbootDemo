package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by k-higa on 2017/07/04. dd
 */
@Controller
public class DemoController { ///

    @GetMapping("/")
    public String get(Model model) {
        model.addAttribute("home", "hello world");
        return "index";
    }
}
