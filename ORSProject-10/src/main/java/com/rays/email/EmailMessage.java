package com.rays.email;

/**
 * Model class for Email Message.
 * 
 * This class represents the structure of an email
 * including recipient, subject, message content,
 * and message type (HTML or Text).
 * 
 * Features:
 * - Supports both HTML and plain text emails
 * - Provides constants for message type identification
 * 
 * @author Chaitanya Bhatt
 */
public class EmailMessage {

    /**
     * Recipient email address.
     */
    private String to;

    /**
     * Email subject.
     */
    private String subject;

    /**
     * Email message content.
     */
    private String message;

    /**
     * Type of message (HTML or TEXT).
     */
    private int messageType = TEXT_MSG;

    /**
     * Constant for HTML message type.
     */
    public static final int HTML_MSG = 1;

    /**
     * Constant for Text message type.
     */
    public static final int TEXT_MSG = 2;

    /**
     * Default constructor.
     */
    public EmailMessage() {
    }

    /**
     * Parameterized constructor.
     * 
     * @param to recipient email
     * @param subject email subject
     * @param message email content
     */
    public EmailMessage(String to, String subject, String message) {
        this.to = to;
        this.subject = subject;
        this.message = message;
    }

    /**
     * @return recipient email
     */
    public String getTo() {
        return to;
    }

    /**
     * @param to recipient email
     */
    public void setTo(String to) {
        this.to = to;
    }

    /**
     * @return subject
     */
    public String getSubject() {
        return subject;
    }

    /**
     * @param subject email subject
     */
    public void setSubject(String subject) {
        this.subject = subject;
    }

    /**
     * @return message content
     */
    public String getMessage() {
        return message;
    }

    /**
     * @param message email content
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * @return message type (HTML or TEXT)
     */
    public int getMessageType() {
        return messageType;
    }

    /**
     * @param messageType type of message
     */
    public void setMessageType(int messageType) {
        this.messageType = messageType;
    }
}