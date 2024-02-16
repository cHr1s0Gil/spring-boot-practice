package org.practice.practice.user.dto

data class UserDTO (
    val uuid: String,
    private val _userid: String,
    private val _password: String,
    private val _salt: String,
    private val _nickname: String
) {
    val userid: String
        get() = _userid
    val password: String
        get() = _password
    val salt: String
        get() = _salt
    val nickname: String
        get() = _nickname
}