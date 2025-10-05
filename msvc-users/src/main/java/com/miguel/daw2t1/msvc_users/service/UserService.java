package com.miguel.daw2t1.msvc_users.service;

import java.util.List;
import java.util.Optional;

import com.miguel.daw2t1.msvc_users.entity.User;

public interface UserService {

    List<User> findAll();
    
    Optional<User> findById(Long id);

}
