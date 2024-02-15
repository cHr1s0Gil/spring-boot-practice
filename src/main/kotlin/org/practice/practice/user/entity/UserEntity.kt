package org.practice.practice.user.entity

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.Table
import jakarta.persistence.UniqueConstraint
import java.util.*

@Entity
@Table(
    name = "TEST_USER",
    uniqueConstraints = [UniqueConstraint(columnNames = ["UUID"])]
)
class UserEntity (
    @Id
    @Column(name = "UUID", length = 36, nullable = false, unique = true)
    var uuid: String? = null,

    @Column(name = "USERID", length = 50, nullable = false, unique = true)
    var userid: String = "",

    @Column(name = "PASSWORD", length = 128, nullable = false, unique = false)
    var password: String = "",

    @Column(name = "SALT", length = 128, nullable = false, unique = false)
    var salt: String? = "test",

    @Column(name = "NICKNAME", length = 15, nullable = false, unique = true)
    var nickname: String? = "test"
) {
    init {
        this.uuid = UUID.randomUUID().toString()
    }
}