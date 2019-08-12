package com.ranck.wx.service;

import com.ranck.wx.domain.User;
import com.ranck.wx.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public User addUser (User user) {
        userRepository.save(user);
        return user;
    }

}
