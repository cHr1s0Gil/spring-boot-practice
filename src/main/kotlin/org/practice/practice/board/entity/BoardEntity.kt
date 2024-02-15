package org.practice.practice.board.entity

import jakarta.persistence.*
import java.time.LocalDate

@Entity
@Table(
    name = "TEST_BOARD",
    uniqueConstraints = [UniqueConstraint(columnNames = ["POST_SEQ"])]
)
class BoardEntity(
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "test_board_seq_generator")
    @SequenceGenerator(name = "test_board_seq_generator", sequenceName = "TEST_BOARD_SEQ", allocationSize = 1)
    @Column(name = "POST_SEQ")
    var postSeq: Int = 0,

    @Column(name = "TITLE", length = 50, nullable = false)
    var title: String = "",

    @Column(name = "AUTHOR", length = 50, nullable = false)
    var author: String = "",

    @Column(name = "WRITEDATE", nullable = false)
    @Temporal(TemporalType.DATE)
    var writeDate: LocalDate = LocalDate.now()
)
