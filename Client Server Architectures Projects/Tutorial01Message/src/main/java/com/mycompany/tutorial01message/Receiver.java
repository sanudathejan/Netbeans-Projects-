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

public class Receiver {

    private static final Logger logger = Logger.getLogger(Receiver.class.getName());

    public void receiveMessage(Message message) {
        logger.info("Receiver: Message received.");
        logger.info("Receiver: Message content = " + message.getContent());
    }
}

