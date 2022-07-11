package coder.chatApp.Controller;

import coder.chatApp.Custom.CustomUserDetails;
import coder.chatApp.Custom.CustomUserDetailsService;
import coder.chatApp.Repository.UserRepository;
import coder.chatApp.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @PostMapping("/api/auth/signup")
    public  User create(@RequestBody User user) {

        User result = userRepository.findByUsername(user.getUsername());
        if (result == null) {
            userRepository.create(user);
            return user;
        }
        return null;
    }

    @PostMapping("/api/auth/login")
    public String login(){
        //Spring will do it;
        return "true";
    }

    @GetMapping("/api/accounts")
    public List<User> getAll(){
        return userRepository.getAll();
    }

    @GetMapping("/api/auth/forgotpassword")
    public User forgotpassword(@RequestParam("username") String username) {
        User result = userRepository.findByUsername(username);
        System.out.println(result.toString());
        if (result == null) {
            return null;
        }
        return result;
    }
}
