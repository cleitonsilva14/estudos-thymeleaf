package br.com.estudos.thymeleaf.controller;


import br.com.estudos.thymeleaf.model.UserModel;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class UserModelController {

    @GetMapping("variable-expression")
    public String variableExpression(Model model){
        UserModel user = new UserModel(30L, "Maria", "maria@gmail.com", "USER", "F");
        model.addAttribute("user", user);
        return "variable-expression";
    }

    @GetMapping("selection-expression")
    public String selectionExpression(Model model){
        UserModel user = new UserModel(22L, "Lucas", "lucas.silva@gmail.com", "ADMIN", "M");
        model.addAttribute("user", user);
        return "selection-expression";
    }


    @GetMapping("message-expression")
    public String messageExpression(){
        return "message-expression";
    }


    @GetMapping("link-expression")
    public String linkExpression(Model model){
        model.addAttribute("id", 1);
        return "link-expression";
    }

    // handle fragment expression
    @GetMapping("fragment-expression")
    public String fragmentExpression(){
        return "fragment-expression";
    }

    @GetMapping("css-js-page")
    public String cssJsPage(){
        return "css-js-page";
    }

    @GetMapping("/users")
    public String users(Model model){

        UserModel admin = new UserModel(1L, "Admin 001", "admin001@localhost.com", "ADMIN", "M");
        UserModel user = new UserModel(2L,"User 001", "user001@localhost.com", "USER", "F");

        List<UserModel> users = new ArrayList<>();
        users.add(admin);
        users.add(user);

        model.addAttribute("users", users);
        return "users";

    }


}
