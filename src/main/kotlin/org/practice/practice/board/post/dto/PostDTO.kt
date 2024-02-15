package org.practice.practice.board.post.dto

import org.practice.practice.board.entity.BoardEntity

data class PostDTO(
    val postSeq: Int,
    val content: String,
    val board: BoardEntity
)
