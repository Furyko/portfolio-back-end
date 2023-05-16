package com.julianpalavecino.portfolio.repository;

import com.julianpalavecino.portfolio.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {
    User findByUserId(String userId);
}
