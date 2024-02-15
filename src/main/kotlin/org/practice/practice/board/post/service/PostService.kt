package org.practice.practice.board.post.service

import org.practice.practice.board.post.dto.PostDTO
import org.practice.practice.board.post.entity.PostEntity
import org.practice.practice.board.post.mapper.PostMapper
import org.practice.practice.board.post.repository.PostRepository
import org.springframework.stereotype.Service

@Service
class PostService(private val postRepository: PostRepository) {
    fun findPostByPostSeq(postSeq: Int): PostDTO? {
        val postEntity: PostEntity? = postRepository.findByPostSeq(postSeq)
        return postEntity?.let { PostMapper.postEntity2DTO(it) }
    }
}