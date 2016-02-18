package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by ed on 2/18/16.
 */

@Controller
public class ExampleController {

    @RequestMapping("/home")
    public String loadExampleHome(Model model) {
        model.addAttribute("name", "Example App");
        return "home";
    }
}
