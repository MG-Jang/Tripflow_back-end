package com.ddabong.tripflow.board.dao;

import com.ddabong.tripflow.board.dto.BoardDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface IBoardRepository {
    void save(BoardDTO boardDTO);
    List<BoardDTO> findAll();
    //조회수 횟수를 update
    void updateHits(Long id);
    BoardDTO findById(Long id);
    void update(BoardDTO boardDTO);
    void delete(Long id);
}