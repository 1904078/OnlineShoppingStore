package com.onlineshoppingstore.User.Controller;

import com.onlineshoppingstore.User.Model.User;
import com.onlineshoppingstore.User.Repository.UserRepository;
import java.util.Collection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

  @Autowired
  UserRepository userRepository;

  @GetMapping("/allUsers")
  public Collection<User> getAllUserDetails() {
    return userRepository.findAll();
  }

  @PostMapping("/addUser")
  public User addUser(@RequestBody User user) {
    userRepository.insert(user);
    if (user != null) {
      return user;
    } else {
      return null;
    }
  }
  @DeleteMapping("/deleteOneUser/{id}")
  public User deleteUser(@PathVariable String id) {
    User user = userRepository.findById(id).orElse(null);
    if (user != null) {
      userRepository.deleteById(id);
      return user;
    } else {
      return null;
    }
  }

}
