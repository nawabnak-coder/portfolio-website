package com.nawab.portfolio.service;

import com.nawab.portfolio.model.ContactForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailService {
    
    @Autowired
    private JavaMailSender mailSender;
    
    public void sendEmail(String to, String subject, String body) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo(to);
        message.setSubject(subject);
        message.setText(body);
        
        mailSender.send(message);
    }
    
    public void sendContactFormNotification(ContactForm contactForm) {
        String subject = "New Contact Form Submission: " + contactForm.getSubject();
        String body = "Name: " + contactForm.getName() + "\n" +
                     "Email: " + contactForm.getEmail() + "\n" +
                     "Subject: " + contactForm.getSubject() + "\n" +
                     "Message: " + contactForm.getMessage() + "\n" +
                     "Submitted at: " + contactForm.getCreatedAt();
        
        // Send to your email address
        sendEmail("nawabnak@gmail.com", subject, body);
        
        // Send confirmation to the user
        String userSubject = "Thank you for contacting Md Nawab Ali Khan";
        String userBody = "Dear " + contactForm.getName() + ",\n\n" +
                         "Thank you for reaching out. I have received your message and will get back to you shortly.\n\n" +
                         "Best regards,\nMd Nawab Ali Khan";
        
        sendEmail(contactForm.getEmail(), userSubject, userBody);
    }
}
