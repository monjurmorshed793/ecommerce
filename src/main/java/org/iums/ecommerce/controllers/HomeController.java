package org.iums.ecommerce.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HomeController {
    @RequestMapping("home")
    public String showHome(){
        return "home";
    }

    @RequestMapping("/")
    public String redirectToHome(){
        return "redirect:home";
    }
}
