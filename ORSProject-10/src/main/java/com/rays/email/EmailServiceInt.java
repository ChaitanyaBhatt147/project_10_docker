package com.rays.email;

/**
 * Service interface for sending emails.
 * 
 * This interface defines the contract for email sending functionality.
 * Implementations of this interface will handle the logic for sending
 * emails (e.g., using SMTP, JavaMailSender, etc.).
 * 
 * @author Chaitanya Bhatt
 */
public interface EmailServiceInt {

	/**
	 * Sends an email message.
	 * 
	 * @param msg EmailMessage object containing recipient, subject, and content
	 */
	public void sendMail(EmailMessage msg);
}