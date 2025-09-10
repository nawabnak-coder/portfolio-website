package com.nawab.portfolio.service;

import com.nawab.portfolio.model.ContactForm;
import com.nawab.portfolio.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContactService {
    
    @Autowired
    private ContactRepository contactRepository;
    
    @Autowired
    private EmailService emailService;
    
    public ContactForm saveContactForm(ContactForm contactForm) {
        ContactForm savedForm = contactRepository.save(contactForm);
        emailService.sendContactFormNotification(savedForm);
        return savedForm;
    }
}
