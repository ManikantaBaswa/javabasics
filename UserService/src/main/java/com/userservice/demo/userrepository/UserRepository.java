package com.userservice.demo.userrepository;

import org.springframework.data.r2dbc.repository.R2dbcRepository;

import com.userservice.demo.userentity.User;

public interface UserRepository extends R2dbcRepository<User, Long> {

}
