package com.ddabong.tripflow.board.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter //getter setter를 사용하므로서 각 필드에 대해 설정해준다.
@Setter
@ToString//BoarDTO 안에는 sql의 컬럼 내용이 들어가 있다.
public class BoardDTO {
    private Long id;
    private String boardWriter;
    private String boardPass;
    private String boardTitle;
    private String boardContents;
    private int boardHits;
    private String createdAt;

    //좋아요
    private Long likeid;
    //후기 기본키
    private Long postid;
    //회원 키
    private Long memberid;
    //일정 기본키
    private Long travelid;
    //게시물 내용
    private String content;
}