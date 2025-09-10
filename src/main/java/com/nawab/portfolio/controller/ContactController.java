package com.nawab.portfolio.controller;

import com.nawab.portfolio.model.ContactForm;
import com.nawab.portfolio.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class ContactController {
    
    @Autowired
    private ContactService contactService;
    
    @GetMapping("/")
    public String index(Model model) {
        return "index";
    }
    
    @PostMapping("/contact")
    @ResponseBody
    public ResponseEntity<String> submitContactForm(@RequestBody ContactForm contactForm) {
        try {
            contactService.saveContactForm(contactForm);
            return ResponseEntity.ok("Message sent successfully!");
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Error sending message: " + e.getMessage());
        }
    }
}
