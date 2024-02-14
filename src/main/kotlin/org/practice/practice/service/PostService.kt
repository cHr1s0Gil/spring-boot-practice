package org.practice.practice.service

import org.practice.practice.entity.Post
import org.practice.practice.repository.PostRepository
import org.springframework.stereotype.Service

@Service
class PostService(private val postRepository: PostRepository) {
    fun findPostByPostSeq(postSeq: Int): Post {
        println("postSeq :$postSeq")
        return postRepository.findPostByPostSeq(postSeq)
    }
}