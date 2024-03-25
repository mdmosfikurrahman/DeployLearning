package com.learning.deploy.controller;

import com.learning.deploy.model.ExampleEntity;
import com.learning.deploy.service.ExampleService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    private final ExampleService exampleService;

    public HomeController(ExampleService exampleService) {
        this.exampleService = exampleService;
    }

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("message", "Welcome to Deploy Learning!");

        // Add some data to MySQL
        ExampleEntity example = new ExampleEntity();
        example.setName("Sample Data");
        exampleService.saveExample(example);

        return "index";
    }
}
