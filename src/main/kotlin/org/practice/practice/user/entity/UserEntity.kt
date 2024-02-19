package org.practice.practice.user.entity

import jakarta.persistence.*
import org.apache.catalina.User
import org.practice.practice.user.enum.UserEnum

@Entity
@Table(
    name = "TEST_USER",
    uniqueConstraints = [UniqueConstraint(columnNames = ["UUID"])]
)
class UserEntity (
    @Id
    @Column(name = "UUID", length = 36, nullable = false, unique = true)
    var uuid: String = UserEnum.UNDEFINED.toString(),

    @Column(name = "USERID", length = 50, nullable = false, unique = true)
    var userid: String = UserEnum.UNKNOWN.toString(),

    @Column(name = "PASSWORD", length = 128, nullable = false, unique = false)
    var password: String = UserEnum.UNDEFINED.toString(),

    @Column(name = "NICKNAME", length = 15, nullable = false, unique = true)
    var nickname: String = UserEnum.UNKNOWN.toString(),
)
