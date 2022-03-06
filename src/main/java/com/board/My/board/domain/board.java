package com.board.My.board.domain;

import lombok.Getter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Entity
public class board {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "board_id")
    private Long id;

    @Column(length = 50, nullable = false)
    private String title;

    @Lob   /**@Lob을 통해 크기 제한이 없게 하였음**/
    private String content;

    private LocalDateTime createdDate;

    @ManyToOne(fetch = FetchType.LAZY)      /**@ManyToOne을 붙여 User와의 연관관계를 생성하였습니다.**/
    @JoinColumn(name = "user_id")
    private User user;
}
