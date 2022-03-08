package com.board.My.board.dto;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Getter
@Setter
public class UserForm {

    @NotEmpty(message = "이메일은 필수 입니다.")          /**validation은 springBoot2.2버전 이하는 포함 이상은 따로 추가해야함**/
    @Size(max = 100, message = "이메일은 100자리를 초과할 수 없습니다.")
    private String email;

    @NotEmpty(message = "이름은 필수 입니다.")
    @Size(max = 20, message = "이름은 20자리를 초과할 수 없습니다.")
    private String userName;

    @NotEmpty(message = "비밀번호는 필수 입니다.")
    @Size(max = 100, message = "비밀번호는 100자리를 초과할 수 없습니다.")
    private String password;

    /**@NotEmpty 와 @Size 어노테이션을 통해 dto의 내용을 검증하고 검증 실패시 에러를 집어 던져준다.
     * 코드단에서 직접 설정해 줄수 있지만 너무 길어지니 어노테이션을 통해 검증하는 것**/
}
