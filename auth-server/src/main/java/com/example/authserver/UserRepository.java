package com.example.authserver;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {

    User findByUserName(String name);

    @Override
    void delete(User user);
}
