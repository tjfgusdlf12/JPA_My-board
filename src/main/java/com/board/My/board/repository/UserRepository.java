package com.board.My.board.repository;

import com.board.My.board.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
    boolean existByEmail(String email);
}
