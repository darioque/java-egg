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

import com.darioque.spring1.entities.Book;
import com.darioque.spring1.exceptions.MyException;
import com.darioque.spring1.services.AuthorService;
import com.darioque.spring1.services.BookService;
import com.darioque.spring1.services.PublisherService;

@Controller
@RequestMapping("/books")
public class BookController {

    @Autowired
    private BookService bookService;
    @Autowired
    private AuthorService authorService;
    @Autowired
    private PublisherService publisherService;

    @GetMapping("/register")
    public String bookForm(ModelMap model) {

        model.addAttribute("authors", authorService.listAuthors());
        model.addAttribute("publishers", publisherService.listPublishers());

        return "book_form.html";
    }

    @PostMapping("/register")
    public String register(@RequestParam(required = false) String isbn, @RequestParam String title,
            @RequestParam(required = false) Integer copies,
            @RequestParam(required = false) String idAuthor, @RequestParam(required = false) String idPublisher,
            RedirectAttributes redirectAttributes)
            throws MyException {

        try {

            redirectAttributes.addFlashAttribute("success",
                    "Successfully created book: "
                            + bookService.createBook(isbn, title, copies, idAuthor, idPublisher).getTitle());

        } catch (MyException e) {
            Logger.getLogger(BookController.class.getName()).log(Level.SEVERE, e.getMessage());
            redirectAttributes.addFlashAttribute("error", e.getMessage());
            return "redirect:/books/register";
        }
        return "redirect:/";

    }

    @GetMapping("/list")
    public String listAuthors(ModelMap model) {
        List<Book> books = bookService.listBooks();
        model.addAttribute("books", books);
        return "book_list.html";
    }
}
