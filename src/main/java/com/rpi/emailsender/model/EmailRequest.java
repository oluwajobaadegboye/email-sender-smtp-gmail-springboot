package com.rpi.emailsender.model;

import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class EmailRequest {

    @NotEmpty(message = "Recipient Email \"to\" can not be empty")
    private String to;
    @NotEmpty(message = "Subject can not be empty")
    private String subject;
    @NotEmpty(message = "Message can not be empty")
    private String message;
}
