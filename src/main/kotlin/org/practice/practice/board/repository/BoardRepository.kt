package org.practice.practice.board.repository

import org.practice.practice.board.entity.BoardEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.stereotype.Repository

@Repository
interface BoardRepository: JpaRepository<BoardEntity, Int>{
    override fun findAll(): List<BoardEntity>

    fun findByPostSeq(postSeq: Int): BoardEntity?
}