package com.example.springbootsendmail.service;

import com.example.springbootsendmail.model.Mail;

public interface MailService {
    String sendEmail(Mail mail);
}
