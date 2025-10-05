package com.miguel.daw2t1.msvc_users.repository;

import org.springframework.data.repository.CrudRepository;

import com.miguel.daw2t1.msvc_users.entity.User;

public interface UserRepository extends CrudRepository<User, Long> {

}
