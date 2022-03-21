package com.board.My.board.controller;

import com.board.My.board.dto.UserForm;
import com.board.My.board.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.validation.Valid;

@Controller
@RequiredArgsConstructor
@ResponseBody
public class UserController {
    private final UserService userService;
    /**UserRepository와 마찬가지로 UserService를 final필드로 등록함으로서
     * Controller --> Service --> Repository의 구조가 완성이 됐음      **/

    @PostMapping("/signup")
    public void signUpUser(@RequestBody @Valid UserForm userForm) throws Exception {
        userService.signUpUser(userForm);
    }
}
