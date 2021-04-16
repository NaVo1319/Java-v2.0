package com.example.pr14.Controllers;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class ControlHome {
    @RequestMapping(value = "/home", produces = MediaType.TEXT_HTML_VALUE)
    public String home() {
        return "home.html";
    }

    @RequestMapping(value = "/home2", produces = MediaType.TEXT_HTML_VALUE)
    public String home2() {
        return "home.html";
    }
}
