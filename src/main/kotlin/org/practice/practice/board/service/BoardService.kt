package org.practice.practice.board.service

import org.practice.practice.board.dto.BoardDTO
import org.practice.practice.board.entity.BoardEntity
import org.practice.practice.board.mapper.BoardMapper
import org.practice.practice.board.repository.BoardRepository
import org.springframework.stereotype.Service

@Service
class BoardService(private val boardRepository: BoardRepository) {
    fun getAllBoard(): List<BoardDTO> {
        val boardEntities: List<BoardEntity> = boardRepository.findAll()
        return boardEntities.map { BoardMapper.boardEntity2DTO(it) }
    }

    fun findByPostSeq(postSeq: Int): BoardDTO? {
        val boardEntity: BoardEntity? = boardRepository.findByPostSeq(postSeq)
        return boardEntity?.let { BoardMapper.boardEntity2DTO(it) }
    }
}