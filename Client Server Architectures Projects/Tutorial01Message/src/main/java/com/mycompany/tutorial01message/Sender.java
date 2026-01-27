/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tutorial01message;

/**
 *
 * @author Sanuda
 */
public class Sender {

    // Create a message
    public Message createMessage(String content) {
        Message message = new Message(content);
        System.out.println("Sender: Message created.");
        return message;
    }

    // Send a message to Receiver
    public void sendMessage(Message message, Receiver receiver) {
        System.out.println("Sender: Sending message to receiver...");
        receiver.receiveMessage(message);
    }
}

