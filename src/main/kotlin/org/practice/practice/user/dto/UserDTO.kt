package org.practice.practice.user.dto

data class UserDTO (
    val uuid: String? = null,
    val userid: String,
    val password: String,
    val salt: String? = "salt",
    val nickname: String? = "nickname"
)