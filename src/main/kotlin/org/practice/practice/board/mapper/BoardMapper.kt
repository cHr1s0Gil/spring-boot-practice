package org.practice.practice.board.mapper

import org.practice.practice.board.dto.BoardDTO
import org.practice.practice.board.entity.BoardEntity

object BoardMapper {
    fun boardEntity2DTO(boardEntity: BoardEntity): BoardDTO {
        return BoardDTO(
            postSeq = boardEntity.postSeq,
            title = boardEntity.title,
            author = boardEntity.author,
            writeDate = boardEntity.writeDate
        )
    }
}