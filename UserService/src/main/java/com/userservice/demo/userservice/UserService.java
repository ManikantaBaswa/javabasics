package com.userservice.demo.userservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.userservice.demo.userentity.User;
import com.userservice.demo.userrepository.UserRepository;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public Flux<User> getAllUsers() {
        return userRepository.findAll();
    }

    public Mono<User> getUserById(Long id) {
        return userRepository.findById(id);
    }

    public Mono<User> createUser(User user) {
        return userRepository.save(user);
    }

    public Mono<Void> deleteUser(Long id) {
        return userRepository.deleteById(id);
    }
}

