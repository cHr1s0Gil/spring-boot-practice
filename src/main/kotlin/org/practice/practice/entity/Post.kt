package org.practice.practice.entity

import jakarta.persistence.*

@Entity
@Table(name = "TEST_POST")
class Post (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "POST_SEQ", nullable = false)
    var postSeq: Int = 0,

    @Column(name = "CONTENT", length = 500)
    var content: String = "",

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "POST_SEQ", referencedColumnName = "POST_SEQ", insertable = false, nullable = false, updatable = false)
    var board: Board = Board()
)