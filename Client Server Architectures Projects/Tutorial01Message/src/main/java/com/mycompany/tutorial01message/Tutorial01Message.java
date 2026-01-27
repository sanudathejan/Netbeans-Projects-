/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tutorial01message;

/**
 *
 * @author Sanuda
 */
public class Tutorial01Message {

    public static void main(String[] args) {

        // Create Sender and Receiver objects
        Sender sender = new Sender();
        Receiver receiver = new Receiver();

        // Sender creates a message
        Message message = sender.createMessage("Hello! This is a test message.");

        // Sender sends message to Receiver
        sender.sendMessage(message, receiver);
    }
}
