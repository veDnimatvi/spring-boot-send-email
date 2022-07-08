package com.example.springbootsendmail.controller;

import com.example.springbootsendmail.model.Mail;
import com.example.springbootsendmail.service.MailService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class MailController {
    private final MailService mailService;

    @PostMapping("/send")
    public String sendMail(@RequestBody Mail mail){
        return mailService.sendEmail(mail);
    }
}
