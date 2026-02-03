/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Sanuda
 */
public class UserProcessor implements Runnable {

    private UserValidator validator;
    private UserDataStore dataStore;
    private Object lock;
    private String name;
    private int age;

    public UserProcessor(String name, int age,
                         UserDataStore ds, Object lock) {
        this.name = name;
        this.age = age;
        this.dataStore = ds;
        this.lock = lock;
        this.validator = new UserValidator();
    }

    @Override
    public void run() {
        synchronized(lock) {
            if (validator.isValidAge(age)) {
                System.out.println("Processing user " + name);
                dataStore.addUser(new User(name, age));
            } else {
                System.out.println("Invalid age for " + name);
            }
        }
    }
}

