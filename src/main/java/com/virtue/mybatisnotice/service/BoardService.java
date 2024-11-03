package com.virtue.mybatisnotice.service;

import com.virtue.mybatisnotice.dto.BoardDTO;
import com.virtue.mybatisnotice.repository.BoardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BoardService {
    private final BoardRepository boardRepository;

    public void save(BoardDTO boardDTO) {
        boardRepository.save(boardDTO);
    }

    public List<BoardDTO> findAll() {
        return boardRepository.findAll();
    }

    public void updateHits(Long id) {
        boardRepository.updateHist(id);
    }

    public BoardDTO findById(Long id) {
        return boardRepository.findById(id);
    }
}
