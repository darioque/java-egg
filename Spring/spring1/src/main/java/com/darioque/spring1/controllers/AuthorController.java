package com.darioque.spring1.controllers;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.darioque.spring1.exceptions.MyException;
import com.darioque.spring1.services.AuthorService;

@Controller
@RequestMapping("/authors")
public class AuthorController {

    @Autowired
    private AuthorService authorService;

    @GetMapping("/register")
    public String authorForm() {
        return "author_form.html";
    }

    @PostMapping("/register")
    public String register(@RequestParam String name) throws MyException {

        try {
            authorService.createAuthor(name);

        } catch (MyException e) {
            Logger.getLogger(AuthorController.class.getName()).log(Level.SEVERE, e.getMessage());
            return "redirect:/authors/register";
        }
        return "redirect:/";

    }
}
