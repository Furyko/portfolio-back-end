package com.julianpalavecino.portfolio.service;


import com.julianpalavecino.portfolio.entity.User;

public interface UserService {


    User newUser(User newUser);
    Iterable<User> getAll();
    User modifyUser(User user);
    Boolean deleteUser(String idUser);
}
