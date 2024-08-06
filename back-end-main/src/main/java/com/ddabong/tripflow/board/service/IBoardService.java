package com.ddabong.tripflow.board.service;

import com.ddabong.tripflow.board.dto.BoardDTO;

import java.util.List;

public interface IBoardService {

    void save(BoardDTO boardDTO);

    List<BoardDTO> findAll();

    void updateHits(Long id);

    BoardDTO findById(Long id);

    void update(BoardDTO boardDTO);

    void delete(Long id);
}