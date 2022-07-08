package com.example.springbootsendmail.service.Impl;

import com.example.springbootsendmail.model.Mail;
import com.example.springbootsendmail.service.MailService;
import lombok.RequiredArgsConstructor;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MailServiceImpl implements MailService {
    private final JavaMailSender javaMailSender;

    @Override
    public String sendEmail(Mail mail) {
        SimpleMailMessage msg = new SimpleMailMessage();
        msg.setFrom(mail.getYourEmail());
        msg.setTo("codertom100@gmail.com");
        msg.setSubject(mail.getSubject());
        msg.setText(mail.getMessage());
        javaMailSender.send(msg);
        return "Send Successful!";
    }
}
