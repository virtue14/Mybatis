package com.virtue.mybatisnotice.service;

import com.virtue.mybatisnotice.dto.BoardDTO;
import com.virtue.mybatisnotice.repository.BoardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BoardService {
    private final BoardRepository boardRepository;

    public void save(BoardDTO boardDTO) {
        boardRepository.save(boardDTO);
    }
}
