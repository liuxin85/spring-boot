package com.example.store;

public interface UserRepository {
    void save(User user);
    User findByEmail(String email);
}
