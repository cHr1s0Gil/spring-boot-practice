package org.practice.practice.repository

import org.practice.practice.entity.Post
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.stereotype.Repository

@Repository
interface PostRepository: JpaRepository<Post, Int> {
    @Query("SELECT p FROM Post p WHERE p.postSeq = :postSeq")
    fun findPostByPostSeq(postSeq: Int): Post
}