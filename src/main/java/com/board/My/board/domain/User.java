package com.board.My.board.domain;

import com.board.My.board.dto.UserForm;
import lombok.Getter;

import javax.persistence.*;

@Entity
@Getter
public class User {
    @Id                 /**@Id - 해당 칼럼이 식별키(PK, Primary key)라는 것을 의미합니다.**/
    @GeneratedValue(strategy = GenerationType.AUTO)  /**@GeneratedValue와 함께 식별키를 어떤 전략으로 생성하는지 명시합니다.**/
    @Column(name = "user_id")
    private Long id;

    @Column(length = 50, nullable = false)
    private String email;

    @Column(length = 50, nullable = false)
    private String userName;

    @Column(length = 50, nullable = false)
    private String password;

    /**생성자를 바로 호출하지 않는 이유는
     * https://codinghack.tistory.com/17?category=846652
     * 해당 링크를 참고 **/
    public User(){}

    public User(UserForm userForm){
        this.email = userForm.getEmail();
        this.userName = userForm.getUserName();
        this.password = userForm.getPassword();
    }

    public static User createdUser(UserForm userForm){
        return new User(userForm);
    }
}
