package com.ranck.wx.repository;

import com.ranck.wx.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
    User getUserById(Integer id);
}
