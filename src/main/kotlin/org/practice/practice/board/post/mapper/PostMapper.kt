package org.practice.practice.board.post.mapper

import org.practice.practice.board.post.dto.PostDTO
import org.practice.practice.board.post.entity.PostEntity

object PostMapper {
    fun postEntity2DTO(postEntity: PostEntity): PostDTO {
        return PostDTO(
            postEntity.postSeq,
            postEntity.content,
            postEntity.board
        )
    }
}