package com.ddabong.tripflow.board.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Data
@AllArgsConstructor
public class ResponseDTO {
    private  String message;
    private  int status;
    private List<BoardDTO> data;
}
