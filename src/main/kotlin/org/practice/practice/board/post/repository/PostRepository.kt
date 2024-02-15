package org.practice.practice.board.post.repository

import org.practice.practice.board.post.entity.PostEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface PostRepository: JpaRepository<PostEntity, Int> {
    fun findByPostSeq(postSeq: Int): PostEntity?
}