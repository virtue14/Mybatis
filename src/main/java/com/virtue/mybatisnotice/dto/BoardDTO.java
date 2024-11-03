package com.virtue.mybatisnotice.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Getter
@Setter
@ToString
public class BoardDTO {
    private Long id; // 글번호
    private String boardWriter; // 작성자
    private String boardPass; // 게시글 비밀번호
    private String boardTitle; // 제목
    private String boardContents; // 내용
    private int boardHits; // 조회수
    private String createdAt;   // 작성일
    private int fileAttached; // 첨부파일 유무
    private List<MultipartFile> boardFile; // 첨부파일
}
