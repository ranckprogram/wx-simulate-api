package com.ranck.wx.service;

import com.ranck.wx.domain.User;
import com.ranck.wx.repository.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class AuthService {

    private static Logger logger = LoggerFactory.getLogger(AddressService.class);

    @Autowired
    UserRepository userRepository;

    public User login(String wx, String password) {
        logger.warn(wx);
        logger.warn(password);
        User user = userRepository.getUserByWx(wx);
        logger.warn(user.toString());
        return user;
    }
}
