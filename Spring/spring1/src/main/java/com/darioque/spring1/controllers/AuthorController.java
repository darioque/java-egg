package com.darioque.spring1.controllers;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.darioque.spring1.entities.Author;
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
    public String register(@RequestParam String name, RedirectAttributes redirectAttributes) throws MyException {

        try {

            redirectAttributes.addFlashAttribute("success",
                    "Successfully created author: " + authorService.createAuthor(name).getName());

        } catch (MyException e) {
            Logger.getLogger(AuthorController.class.getName()).log(Level.SEVERE, e.getMessage());
            redirectAttributes.addFlashAttribute("error", e.getMessage());
            return "redirect:/authors/register";
        }
        return "redirect:/";

    }

    @GetMapping("/list")
    public String listAuthors(ModelMap model) {
        List<Author> authors = authorService.listAuthors();
        model.addAttribute("authors", authors);
        return "author_list.html";
    }
    @GetMapping("/update/{authorId}")
    
    public String updateAuthor(@PathVariable String authorId, ModelMap model) {
        Author author = authorService.getAuthor(authorId);
        model.addAttribute("author", author.getName());
        return "author_form.html";
    }
}
