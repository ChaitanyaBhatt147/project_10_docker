package com.rays.email;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * REST Controller for sending emails.
 * 
 * This controller exposes an endpoint to send a test email
 * using the EmailService.
 * 
 * Endpoint:
 * - GET /send → Sends a sample email
 * 
 * Uses EmailServiceInt to handle email sending logic.
 * 
 * @author Chaitanya Bhatt
 */
@RestController
@RequestMapping(name = "Mail")
public class EmailCtl {

	/**
	 * Email service dependency.
	 */
	@Autowired
	private EmailServiceInt emailService;

	/**
	 * Sends a sample email.
	 * 
	 * @return success message
	 */
	@GetMapping("/send")
	public String sendMail() {

		EmailMessage msg = new EmailMessage();
		msg.setTo("cb@gmail.com");
		msg.setSubject("Spring Boot Mail");
		msg.setMessage("Hello, Mail sent successfully!");

		emailService.sendMail(msg);

		return "Mail Sent Successfully";
	}
}