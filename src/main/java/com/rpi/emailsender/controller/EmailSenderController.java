package com.rpi.emailsender.controller;

import com.rpi.emailsender.model.EmailRequest;
import com.rpi.emailsender.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmailSenderController {

    private final EmailService emailService;

    @Autowired
    public EmailSenderController(EmailService emailService) {
        this.emailService = emailService;
    }

    @PostMapping("/send-email")
    public String sendEmail(@RequestBody EmailRequest request) {
        emailService.sendSimpleEmail(request);
        return "Email sent successfully!";
    }
}
