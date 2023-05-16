package com.julianpalavecino.portfolio.controller;

import com.julianpalavecino.portfolio.entity.User;
import com.julianpalavecino.portfolio.repository.UserRepository;
import com.julianpalavecino.portfolio.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
@CrossOrigin(origins = {"http://localhost:4200", "http://localhost:8080"})
public class UserController {
    @Autowired
    private UserService userService;

    @Autowired
    private UserRepository userRepository;

    @PostMapping("/login")
    public ResponseEntity<?> loginUser(@RequestBody User userData) {
        User user = userRepository.findByUserId(userData.getUserId());
        if (user.getPassword().equals(userData.getPassword()))
            return ResponseEntity.ok(user);
        return (ResponseEntity<?>) ResponseEntity.internalServerError();
    }

    @PostMapping("/new")
    public User newUser(@RequestBody User newUser){
        return this.userService.newUser(newUser);
    }

    @GetMapping("/all")
    public Iterable<User> getAll() {
        return userService.getAll();
    }

    @PostMapping("/update")
    public User updateUser(@RequestBody User user) {
        return this.userService.modifyUser(user);
    }

    @PostMapping(value = "/{idUser}")
    public Boolean deleteUser(@PathVariable(value="idUser") String idUser) {
        return this.userService.deleteUser(idUser);
    }
}
