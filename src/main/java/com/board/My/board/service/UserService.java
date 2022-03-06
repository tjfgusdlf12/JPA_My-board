package com.board.My.board.service;

import com.board.My.board.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor        /**@RequiredArgsConstructor 어노테이션을 통해 UserRepository를 받는다**/
public class UserService {

    private final UserRepository userRepository;
}
