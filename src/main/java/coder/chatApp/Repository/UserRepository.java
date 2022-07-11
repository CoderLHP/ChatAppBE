package coder.chatApp.Repository;

import coder.chatApp.model.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
@Repository
public class UserRepository {
    List <User> users = new ArrayList<User>();



    public UserRepository(){
        users.add( new User(1,"admin","admin","ADMIN") );
    }

    public User findByUsername(String username){
        for (User u: users) {
            if (u.getUsername().equals(username)) return u;
        }
        return null;
    }

    public User create(User user) {
        users.add(user);
        return user;
    }

    public List<User> getAll(){
        return users;
    }
}
