/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Sanuda
 */
import java.util.ArrayList; 
import java.util.List; 

public class UserDataStore {
    private List<User> users;
 
    public UserDataStore() {
        users = new ArrayList<>(); 
    }
    
    public void addUser(User user) {
        users.add(user);
    }

    public List<User> getAllUsers() {
        return new ArrayList<>(users);   // return copy for safety
    }
}

