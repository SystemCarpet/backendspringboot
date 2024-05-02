package co.edu.sena.systemcarpet.controller.content.pages;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Public {
    @GetMapping("/")
    public String handleLogin(){
        return "index";
    }
}
