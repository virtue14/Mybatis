package com.virtue.mybatisnotice.controller;

import com.virtue.mybatisnotice.dto.BoardDTO;
import com.virtue.mybatisnotice.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequiredArgsConstructor // final이 붙은 필드를 자동으로 생성하는 생성자를 만들어줌
public class BoardController {
    private final BoardService boardService;

    @GetMapping("/save")
    public String save() {
        return "save";
    }

    @PostMapping("save")
    public String save(BoardDTO boardDTO) {
        System.out.println("boardDTO = " + boardDTO);
        return "index";
    }
}
