package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by k-higa on 2017/07/04.
 */
@Controller
public class DemoController {


    @GetMapping
    public String get() {
        return "index";
    }
}
