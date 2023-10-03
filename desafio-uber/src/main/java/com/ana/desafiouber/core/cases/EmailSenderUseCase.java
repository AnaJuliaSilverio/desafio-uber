package com.ana.desafiouber.core.cases;

public interface EmailSenderUseCase {
    void sendEmail(String toEmail, String subject, String body);
}
