package org.practice.practice.user.repository

import org.practice.practice.user.dto.UserDTO
import org.practice.practice.user.entity.UserEntity
import org.springframework.data.jpa.repository.JpaRepository

interface UserRepository: JpaRepository<UserEntity, ByteArray> {
    fun findByUuid(uuid: String): UserEntity?
    fun findByUserid(userid: String): UserEntity?
}