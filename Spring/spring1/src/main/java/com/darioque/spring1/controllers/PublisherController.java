package com.darioque.spring1.controllers;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.darioque.spring1.entities.Publisher;
import com.darioque.spring1.exceptions.MyException;
import com.darioque.spring1.services.PublisherService;

@Controller
@RequestMapping("/publishers")
public class PublisherController {

    @Autowired
    private PublisherService publisherService;

    @GetMapping("/register")
    public String publisherForm() {
        return "publisher_form.html";
    }

    @PostMapping("/register")
    public String register(@RequestParam String name, RedirectAttributes redirectAttributes) throws MyException {

        try {

            redirectAttributes.addFlashAttribute("success",
                    "Successfully created publisher: " + publisherService.createPublisher(name).getName());

        } catch (MyException e) {
            Logger.getLogger(PublisherController.class.getName()).log(Level.SEVERE, e.getMessage());
            redirectAttributes.addFlashAttribute("error", e.getMessage());
            return "redirect:/publishers/register";
        }
        return "redirect:/";

    }

    @GetMapping("/list")
    public String listPublisher(ModelMap model) {
        List<Publisher> publishers = publisherService.listPublishers();
        model.addAttribute("publishers", publishers);
        return "publisher_list.html";
    }
}
