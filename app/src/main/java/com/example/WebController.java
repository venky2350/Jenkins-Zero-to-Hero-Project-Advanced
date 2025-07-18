package com.example;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("message", "🚀 CI/CD Pipeline with Jenkins, SonarQube, Docker & Argo CD");
        return "index";
    }
}
