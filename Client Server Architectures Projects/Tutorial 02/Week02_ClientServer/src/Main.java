/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Sanuda
 */
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        UserDataStore dataStore = new UserDataStore();
        List<Thread> threadList = new ArrayList<>();
        Object lock = new Object();

        boolean addMore = true;

        while (addMore) {
            System.out.println("Enter Name:");
            String name = scanner.next();

            System.out.println("Enter Age:");
            int age = scanner.nextInt();

            UserProcessor processor =
                new UserProcessor(name, age, dataStore, lock);

            Thread t = new Thread(processor);
            threadList.add(t);
            t.start();

            System.out.println("Add another? (true/false)");
            addMore = scanner.nextBoolean();
        }

        // Wait for all threads
        for (Thread t : threadList) {
            try {
                t.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("--- All Users in DataStore ---");
        System.out.println(dataStore.getAllUsers());
    }
}

