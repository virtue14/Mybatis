package com.virtue.mybatisnotice.controller;

import com.virtue.mybatisnotice.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;

@Controller
@RequiredArgsConstructor // final이 붙은 필드를 자동으로 생성하는 생성자를 만들어줌
public class BoardController {
    private final BoardService boardService;
}
