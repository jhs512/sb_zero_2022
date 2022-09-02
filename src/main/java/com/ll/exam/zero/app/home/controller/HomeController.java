package com.ll.exam.zero.app.home.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequiredArgsConstructor
@RequestMapping("/")
public class HomeController {

    @RequestMapping("")
    public String main() {
        return "home/main";
    }
}
