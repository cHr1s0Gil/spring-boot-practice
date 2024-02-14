package org.practice.practice.service

import org.practice.practice.entity.Board
import org.practice.practice.repository.BoardRepository
import org.springframework.stereotype.Service

@Service
class BoardService(private val boardRepository: BoardRepository) {
    fun getAllBoard(): List<Board> {
        return boardRepository.findAll()
    }

    fun getBoardByPostSeq(postSeq: Int): Board {
        return boardRepository.findByPostSeq(postSeq)
    }
}