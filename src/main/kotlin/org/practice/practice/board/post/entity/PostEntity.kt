package org.practice.practice.board.post.entity

import jakarta.persistence.*
import org.practice.practice.board.entity.BoardEntity

@Entity
@Table(
    name = "TEST_POST",
    uniqueConstraints = [UniqueConstraint(columnNames = ["POSE_SEQ"])]
)
class PostEntity (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "POST_SEQ", nullable = false)
    var postSeq: Int = 0,

    @Column(name = "CONTENT", length = 500)
    var content: String = "",

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "POST_SEQ", referencedColumnName = "POST_SEQ", insertable = false, nullable = false, updatable = false)
    var board: BoardEntity = BoardEntity()
)