package org.practice.practice.repository

import org.practice.practice.entity.Board
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.stereotype.Repository

@Repository
interface BoardRepository: JpaRepository<Board, Int>{
    override fun findAll(): List<Board>

    @Query("SELECT b FROM Board b WHERE b.postSeq = :postSeq ORDER BY b.postSeq DESC")
    fun findByPostSeq(postSeq: Int): Board
}