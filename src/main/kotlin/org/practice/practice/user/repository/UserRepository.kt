package org.practice.practice.user.repository

import org.practice.practice.user.entity.UserEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface UserRepository: JpaRepository<UserEntity, String> {
    fun findByUuid(uuid: String): UserEntity?
    fun findByUserid(userid: String): UserEntity?
}