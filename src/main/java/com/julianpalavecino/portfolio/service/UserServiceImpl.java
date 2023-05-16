package com.julianpalavecino.portfolio.service;

import com.julianpalavecino.portfolio.entity.User;
import com.julianpalavecino.portfolio.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public User newUser(User newUser) {
        return userRepository.save(newUser);
    }

    @Override
    public Iterable<User> getAll() {
        return this.userRepository.findAll();
    }

    @Override
    public User modifyUser(User user) {
        Optional<User> foundUser = this.userRepository.findById(user.getUserId());
        if (foundUser.get() != null) {
            foundUser.get().setUserId(user.getUserId());
            foundUser.get().setPassword(user.getPassword());
            return this.newUser(foundUser.get());
        }
        return null;
    }

    @Override
    public Boolean deleteUser(String idUser) {
        this.userRepository.deleteById(idUser);
        return true;
    }
}
