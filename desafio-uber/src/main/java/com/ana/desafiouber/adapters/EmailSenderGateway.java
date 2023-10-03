package com.ana.desafiouber.adapters;

public interface EmailSenderGateway {
    void sendEmail(String toEmail, String subject, String body);
}
