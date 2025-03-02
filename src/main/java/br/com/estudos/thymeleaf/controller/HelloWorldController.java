package br.com.estudos.thymeleaf.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloWorldController {

    @GetMapping("/hello")
    public String helloWorld(Model model){
        model.addAttribute("message", "Hello World");
        return "hello-world";
    }


}
