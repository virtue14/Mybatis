package com.virtue.mybatisnotice.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class BoardFileDTO {
    private Long id; // 파일 번호
    private Long boardId; // 게시글 번호
    private String originalFileName; // 원본 파일명
    private String storedFileName; // DB에 저장될 파일명
}
