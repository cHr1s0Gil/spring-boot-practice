package org.practice.practice.entity

import jakarta.persistence.*
import java.util.*

@Entity
@Table(name = "TEST_BOARD")
class Board(
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "test_board_seq_generator")
    @SequenceGenerator(name = "test_board_seq_generator", sequenceName = "TEST_BOARD_SEQ", allocationSize = 1)
    @Column(name = "POST_SEQ")
    var postSeq: Int = 0,

    @Column(name = "TITLE", nullable = false)
    var title: String = "",

    @Column(name = "AUTHOR", nullable = false)
    var author: String = "",

    @Column(name = "WRITEDATE", nullable = false, columnDefinition = "TIMESTAMP DEFAULT SYSDATE")
    var writeDate: Date = Date()
)
