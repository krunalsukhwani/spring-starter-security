package com.learn.services;

import com.learn.models.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    List<User> userList = new ArrayList<>();

    public UserService() {
        userList.add(new User("rowel","almuete","rowel@gmail.com"));
        userList.add(new User("diego","hernandez","diego@gmail.com"));
    }

    //get all users
    public List<User> getAllUsers(){
        return this.userList;
    }

    //single user based on username
    public User getUser(String username){
        return this.userList.stream().filter(user -> user.getUsername().equals(username)).findAny().orElse(null);
    }

    //add new user
    public User addUser(User user){
        this.userList.add(user);
        return user;
    }
}
