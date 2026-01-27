/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tutorial01message;

import java.util.logging.*;

public class Tutorial01Message {

    private static final Logger logger = Logger.getLogger(Tutorial01Message.class.getName());

    public static void main(String[] args) {

        configureLogger();

        logger.info("Program started...");

        Sender sender = new Sender();
        Receiver receiver = new Receiver();

        Message message = sender.createMessage("Hello! Logging test message.");
        sender.sendMessage(message, receiver);

        logger.info("Program finished.");
    }

    // REQUIRED METHOD FOR EXERCISE
    private static void configureLogger() {
        try {
            Logger globalLogger = Logger.getLogger("");

            Handler[] handlers = globalLogger.getHandlers();
            for (Handler handler : handlers) {
                globalLogger.removeHandler(handler);
            }

            ConsoleHandler consoleHandler = new ConsoleHandler();
            consoleHandler.setLevel(Level.ALL);
            globalLogger.addHandler(consoleHandler);

            globalLogger.setLevel(Level.ALL);

        } catch (Exception e) {
            Logger.getGlobal().log(Level.SEVERE, "Error configuring logger: " + e.getMessage(), e);
        }
    }
}

