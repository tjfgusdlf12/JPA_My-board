package com.board.My.board.repository;

import com.board.My.board.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
/**이렇게 껍데기만 만들어도 SELECT,INSERT,UPDATE,DELETE 가 가능하다.**/
public interface UserRepository extends JpaRepository<User,Long> {
    /**동일 이메일 가입을 방지하기 위해 이메일을 가진 유저가 존재하는지 확인하는 메서드 추가 **/
    boolean existsByEmail(String email);
}
