/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tutorial01message;

/**
 *
 * @author Sanuda
 */
import java.util.logging.Logger;

public class Sender {

    private static final Logger logger = Logger.getLogger(Sender.class.getName());

    public Message createMessage(String content) {
        logger.info("Sender: Creating message...");
        Message message = new Message(content);
        logger.info("Sender: Message created successfully.");
        return message;
    }

    public void sendMessage(Message message, Receiver receiver) {
        logger.info("Sender: Sending message to Receiver...");
        receiver.receiveMessage(message);
    }
}
