package org.practice.practice.board.dto

import java.time.LocalDate

data class BoardDTO (
    val postSeq: Int,
    val title: String,
    val author: String,
    val writeDate: LocalDate
)