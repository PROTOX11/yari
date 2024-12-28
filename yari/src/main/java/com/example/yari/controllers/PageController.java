package com.example.yari.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {
    @RequestMapping("/home")
    public String home(Model model) {
        System.out.println("Home page handler");
        model.addAttribute("youtube_channel","drink the code");
        model.addAttribute("github","https://github.com/PROTOX11");

        return "home";
    }
}
