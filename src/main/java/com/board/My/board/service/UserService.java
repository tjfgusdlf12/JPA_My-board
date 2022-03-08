package com.board.My.board.service;

import com.board.My.board.domain.User;
import com.board.My.board.dto.UserForm;
import com.board.My.board.exception.DuplicateEmailException;
import com.board.My.board.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@RequiredArgsConstructor        /**@RequiredArgsConstructor 어노테이션을 통해 UserRepository를 받는다**/
                                /** 이 어노테이션은 초기화 되지않는 final이나 @NotNull 이 붙은 필드의 생성자를 생성해 준다.**/
                                /** 주로 의존성 주입(Dependence Injection) 편의성을 위해 사용**/
public class UserService {
    private final UserRepository userRepository;

    private void validateDuplicateEmail(String email) throws Exception{
        if(userRepository.existByEmail(email)){
            throw new DuplicateEmailException();
        }
    }

    @Transactional      /**insert 쿼리가 작동할테니 @Transactional을 추가**/
    public void signUpUser(UserForm userForm) throws Exception{
        validateDuplicateEmail(userForm.getEmail());
        userRepository.save(User.createdUser(userForm));
    }
}
